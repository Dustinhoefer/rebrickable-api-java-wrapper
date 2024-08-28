package de.dortmunddev.rebrickable.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.part.PartColorResponseDTO;
import de.dortmunddev.rebrickable.dto.part.PartDTO;
import de.dortmunddev.rebrickable.dto.part.PartDetailsDTO;
import de.dortmunddev.rebrickable.dto.part.PartResponseDTO;

public class PartService {

    private final String apiKey;
    private final String baseUrl;

    public PartService(String apiKey, String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    /**
     * Fetch all parts
     *
     * @return PartResponseDTO
     * @throws JsonProcessingException
     */
    public PartResponseDTO fetchAllParts() throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/parts/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartResponseDTO.class);
    }

    /**
     * Fetch a part by its part number
     *
     * @param part_num
     * @return PartDTO
     * @throws JsonProcessingException
     */
    public PartDTO fetchPartByPartNum(String part_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/parts/" + part_num + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartDTO.class);
    }

    public PartColorResponseDTO fetchColorsByPartNum(String part_num) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/parts/" + part_num + "/colors", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartColorResponseDTO.class);
    }

    public PartDetailsDTO fetchPartDetailsForPartColorCombination(String part_num, String color_id) throws JsonProcessingException {

        String jsonResponse = RebrickableService.fetchData(baseUrl + "/api/v3/lego/parts/" + part_num + "/colors/" + color_id + "/", apiKey);

        return new ObjectMapper().readValue(jsonResponse, PartDetailsDTO.class);
    }

}
