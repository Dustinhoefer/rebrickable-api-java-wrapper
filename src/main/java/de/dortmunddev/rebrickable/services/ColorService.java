package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.RebrickableAPI;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import de.dortmunddev.rebrickable.dto.color.ColorResponseDTO;

public class ColorService {

    private final String apiKey;
    private final String baseUrl;

    public ColorService(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    /**
     * Fetch all colors from the Rebrickable API
     * @return ColorResponseDTO
     * @throws JsonProcessingException
     */
    public ColorResponseDTO fetchAllColors() throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/colors/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, ColorResponseDTO.class);
    }

}
