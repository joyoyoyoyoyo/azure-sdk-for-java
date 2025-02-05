package com.azure.test.aad.selenium.conditional.access;

import com.azure.test.aad.selenium.AADSeleniumITHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

import static com.azure.spring.test.EnvironmentVariable.CONDITIONAL_ACCESS_POLICY_TEST_WEB_API_A_CLIENT_ID;
import static com.azure.test.aad.selenium.AADSeleniumITHelper.createDefaultProperties;
import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

public class AADConditionalAccessIT {

    private AADSeleniumITHelper aadSeleniumITHelper;

    private static final String WEB_API_A_ENDPOINT = "http://localhost:8882/webapiA";
    private static final Logger LOGGER = LoggerFactory.getLogger(AADConditionalAccessIT.class);

    @Test
    public void conditionalAccessTest() {
        Map<String, String> properties = createDefaultProperties();
        properties.put("azure.activedirectory.authorization-clients.webapiA.scopes",
            "api://" + CONDITIONAL_ACCESS_POLICY_TEST_WEB_API_A_CLIENT_ID + "/File.Read");
        aadSeleniumITHelper = new AADSeleniumITHelper(DumbApp.class, properties);
        String body = aadSeleniumITHelper.loginAndGetBodyText();
        Assert.assertEquals("Response from webapiB.", body);
    }

    @After
    public void destroy() {
        aadSeleniumITHelper.destroy();
    }


    @EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
    @SpringBootApplication
    @RestController
    public static class DumbApp {
        @Autowired
        private WebClient webClient;

        @Bean
        public static WebClient webClient(ClientRegistrationRepository clientRegistrationRepository,
                                          OAuth2AuthorizedClientRepository authorizedClientRepository) {
            ServletOAuth2AuthorizedClientExchangeFilterFunction function =
                new ServletOAuth2AuthorizedClientExchangeFilterFunction(clientRegistrationRepository,
                    authorizedClientRepository);
            return WebClient.builder()
                            .apply(function.oauth2Configuration())
                            .build();
        }

        /**
         * Call webapiA and webapiB server, return response body.
         *
         * @param webapiA authorized client for webapiA
         * @return Response response body data.
         */
        @GetMapping("/webapiA/webApiB")
        public String callWebapiA(@RegisteredOAuth2AuthorizedClient("webapiA") OAuth2AuthorizedClient webapiA) {
            return callOboEndpoint(webapiA);
        }

        /**
         * Call WebapiA endpoint
         *
         * @param webapiA Authorized Client
         * @return Response string data.
         */
        private String callOboEndpoint(OAuth2AuthorizedClient webapiA) {
            String body = webClient
                .get()
                .uri(WEB_API_A_ENDPOINT)
                .attributes(oauth2AuthorizedClient(webapiA))
                .retrieve()
                .bodyToMono(String.class)
                .block();
            LOGGER.info("Response from WebapiA: {}", body);
            return body;
        }
    }
}
