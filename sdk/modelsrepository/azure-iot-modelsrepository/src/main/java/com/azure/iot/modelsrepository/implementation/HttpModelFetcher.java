// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.iot.modelsrepository.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.iot.modelsrepository.DtmiConventions;
import com.azure.iot.modelsrepository.ModelsDependencyResolution;
import com.azure.iot.modelsrepository.implementation.models.FetchResult;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The {@link HttpModelFetcher} is an implementation of {@link ModelFetcher} interface
 * for supporting http[s] based model content fetching.
 */
class HttpModelFetcher implements ModelFetcher {
    private final ModelsRepositoryAPIImpl protocolLayer;
    private final ClientLogger logger;

    public HttpModelFetcher(ModelsRepositoryAPIImpl protocolLayer, ClientLogger logger) {
        this.logger = logger;
        this.protocolLayer = protocolLayer;
    }

    @Override
    public Mono<FetchResult> fetchAsync(String dtmi, URI repositoryUri, ModelsDependencyResolution resolutionOption, Context context) {
        Queue<String> work = new LinkedList<>();
        try {
            if (resolutionOption == ModelsDependencyResolution.TRY_FROM_EXPANDED) {
                work.add(getPath(dtmi, repositoryUri, true));
            }
            work.add(getPath(dtmi, repositoryUri, false));
        } catch (Exception e) {
            return Mono.error(e);
        }

        String tryContentPath = work.poll();

        logger.info(String.format(LoggerStandardStrings.FetchingModelContent, tryContentPath));

        return evaluatePath(tryContentPath, context)
                .onErrorResume(error -> {
                    if (work.size() != 0) {
                        return evaluatePath(work.poll(), context);
                    } else {
                        return Mono.error(error);
                    }
                })
                .map(s -> new FetchResult().setPath(tryContentPath).setDefinition(s));
    }

    private Mono<String> evaluatePath(String tryContentPath, Context context) {
        return protocolLayer
                .getModelsRepository()
                .getModelFromPathWithResponseAsync(tryContentPath, context)
                .flatMap(response -> {
                    String stringResponse = new String(response, StandardCharsets.UTF_8);
                    return Mono.just(stringResponse);
                });
    }

    private String getPath(String dtmi, URI repositoryUri, boolean expanded) throws URISyntaxException {
        return DtmiConventions.getModelUri(dtmi, repositoryUri, expanded).getPath();
    }
}
