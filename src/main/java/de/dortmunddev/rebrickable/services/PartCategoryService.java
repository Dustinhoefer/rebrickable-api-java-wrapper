package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.part_category.PartCategoryDTO;
import de.dortmunddev.rebrickable.dto.part_category.PartCategoryResponseDTO;

public class PartCategoryService {

    private final String apiKey;
    private final String baseUrl;

    public PartCategoryService(String apiKey, String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    public PartCategoryResponseDTO fetchAllPartCategories() throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/part_categories/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartCategoryResponseDTO.class);
    }

    public PartCategoryDTO fetchPartCategoryById(String id) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/part_categories/" + id + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartCategoryDTO.class);
    }

}
