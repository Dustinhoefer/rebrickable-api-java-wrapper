package de.dortmunddev;

import de.dortmunddev.rebrickable.services.*;
import lombok.Getter;

public class RebrickableAPI {

    public static final String BASE_URL = "https://rebrickable.com";

    @Getter
    private final ColorService colorService;

    @Getter
    private final ElementService elementService;

    @Getter
    private final MinifigService minifigService;

    @Getter
    private final PartCategoryService partCategoryService;

    @Getter
    private final PartService partService;

    @Getter
    private final SetService setService;

    public RebrickableAPI() {

        // load api key from environment variable
        String API_KEY = System.getenv("REBRICKABLE_API_KEY");

        if (API_KEY == null) {
            throw new RuntimeException("REBRICKABLE_API_KEY environment variable not set");
        }

        colorService = new ColorService(API_KEY, BASE_URL);
        elementService = new ElementService(API_KEY, BASE_URL);
        minifigService = new MinifigService(API_KEY, BASE_URL);
        partCategoryService = new PartCategoryService(API_KEY, BASE_URL);
        partService = new PartService(API_KEY, BASE_URL);
        setService = new SetService(API_KEY, BASE_URL);
    }

}
