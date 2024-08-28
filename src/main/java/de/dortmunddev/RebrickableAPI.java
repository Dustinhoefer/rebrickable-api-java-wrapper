package de.dortmunddev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import de.dortmunddev.rebrickable.dto.color.ColorResponseDTO;
import de.dortmunddev.rebrickable.services.ColorService;
import lombok.Getter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RebrickableAPI {

    public static final String BASE_URL = "https://rebrickable.com";

    @Getter
    private final ColorService colorService;

    public RebrickableAPI() {

        // load api key from environment variable
        String API_KEY = System.getenv("REBRICKABLE_API_KEY");

        if (API_KEY == null) {
            throw new RuntimeException("REBRICKABLE_API_KEY environment variable not set");
        }

        colorService = new ColorService(API_KEY, BASE_URL);
    }

}
