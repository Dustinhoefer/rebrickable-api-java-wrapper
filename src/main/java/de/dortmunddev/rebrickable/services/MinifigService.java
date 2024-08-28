package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.minifig.MinifigResponseDTO;

public class MinifigService {

    private final String apiKey;
    private final String baseUrl;

    public MinifigService(String apiKey, String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    /**
     * Fetch all minifigs from the Rebrickable API
     *
     * @return MinifigResponseDTO
     * @throws JsonProcessingException
     */
    public MinifigResponseDTO fetchAllMinifigs() throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/minifigs/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, MinifigResponseDTO.class);
    }

}
