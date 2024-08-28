package de.dortmunddev;

import de.dortmunddev.rebrickable.services.ColorService;
import lombok.Getter;

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
