package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.element.ElementResponseDTO;

public class ElementService {

    private final String apiKey;
    private final String baseUrl;

    public ElementService(String apiKey, String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    /**
     * Fetch a specific color by its id
     *
     * @param id
     * @return ColorDTO
     * @throws JsonProcessingException
     */
    public ElementResponseDTO fetchElementById(String id) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/elements/" + id + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, ElementResponseDTO.class);
    }
}
