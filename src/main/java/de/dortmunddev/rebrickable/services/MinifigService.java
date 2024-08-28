package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.minifig.InventoryResponseDTO;
import de.dortmunddev.rebrickable.dto.minifig.MinifigDTO;
import de.dortmunddev.rebrickable.dto.minifig.MinifigResponseDTO;
import de.dortmunddev.rebrickable.dto.minifig.SetResponseDTO;

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

    /**
     * Fetch a specific minifig by its set_num
     *
     * @param set_num
     * @return MinifigDTO
     * @throws JsonProcessingException
     */
    public MinifigDTO fetchMinifigBySetNum(String set_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/minifigs/" + set_num + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, MinifigDTO.class);
    }

    /**
     * Fetch all parts of a minifig by its set_num
     *
     * @param set_num
     * @return InventoryResponseDTO
     * @throws JsonProcessingException
     */
    public InventoryResponseDTO fetchMinifigPartsBySetNum(String set_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/minifigs/" + set_num + "/parts/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, InventoryResponseDTO.class);
    }

    public SetResponseDTO fetchMinifigSetsBySetNum(String set_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/minifigs/" + set_num + "/sets/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, SetResponseDTO.class);
    }

}
