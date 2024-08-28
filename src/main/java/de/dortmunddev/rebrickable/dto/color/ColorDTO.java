package de.dortmunddev.rebrickable.dto.color;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ColorDTO {
    private int id;
    private String name;
    private String rgb;

    @JsonProperty("is_trans")
    private boolean isTrans;

    @JsonProperty("external_ids")
    private Map<String, ExternalSourceDTO> externalIds;

}