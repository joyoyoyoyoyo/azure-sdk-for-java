// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.EntityRecognitionSkill;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill} and
 * {@link EntityRecognitionSkill}.
 */
public final class EntityRecognitionSkillConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill} to
     * {@link EntityRecognitionSkill}.
     */
    public static EntityRecognitionSkill map(com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill obj) {
        if (obj == null) {
            return null;
        }

        EntityRecognitionSkill entityRecognitionSkill = new EntityRecognitionSkill(obj.getInputs(), obj.getOutputs());

        String name = obj.getName();
        entityRecognitionSkill.setName(name);

        String context = obj.getContext();
        entityRecognitionSkill.setContext(context);

        String description = obj.getDescription();
        entityRecognitionSkill.setDescription(description);

        Boolean includeTypelessEntities = obj.isIncludeTypelessEntities();
        entityRecognitionSkill.setTypelessEntitiesIncluded(includeTypelessEntities);

        if (obj.getDefaultLanguageCode() != null) {
            entityRecognitionSkill.setDefaultLanguageCode(obj.getDefaultLanguageCode());
        }

        if (obj.getCategories() != null) {
            entityRecognitionSkill.setCategories(obj.getCategories());
        }

        Double minimumPrecision = obj.getMinimumPrecision();
        entityRecognitionSkill.setMinimumPrecision(minimumPrecision);
        return entityRecognitionSkill;
    }

    /**
     * Maps from {@link EntityRecognitionSkill} to
     * {@link com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill}.
     */
    public static com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill map(EntityRecognitionSkill obj) {
        if (obj == null) {
            return null;
        }

        com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill entityRecognitionSkill =
            new com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkill(obj.getInputs(),
                obj.getOutputs());

        String name = obj.getName();
        entityRecognitionSkill.setName(name);

        String context = obj.getContext();
        entityRecognitionSkill.setContext(context);

        String description = obj.getDescription();
        entityRecognitionSkill.setDescription(description);

        Boolean includeTypelessEntities = obj.areTypelessEntitiesIncluded();
        entityRecognitionSkill.setIncludeTypelessEntities(includeTypelessEntities);

        if (obj.getDefaultLanguageCode() != null) {
            entityRecognitionSkill.setDefaultLanguageCode(obj.getDefaultLanguageCode());
        }

        if (obj.getCategories() != null) {
            entityRecognitionSkill.setCategories(obj.getCategories());
        }

        Double minimumPrecision = obj.getMinimumPrecision();
        entityRecognitionSkill.setMinimumPrecision(minimumPrecision);

        return entityRecognitionSkill;
    }

    private EntityRecognitionSkillConverter() {
    }
}
