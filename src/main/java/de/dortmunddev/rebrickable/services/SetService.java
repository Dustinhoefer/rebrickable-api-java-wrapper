package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.part.PartSetDTO;
import de.dortmunddev.rebrickable.dto.part.PartSetResponseDTO;

public class SetService {

    private final String apiKey;
    private final String baseUrl;

    public SetService(String apiKey, String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    public PartSetResponseDTO fetchAllSets() throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/sets/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartSetResponseDTO.class);
    }

    public PartSetDTO fetchDetailsForSet(String set_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/sets/" + set_num + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartSetDTO.class);
    }

}
