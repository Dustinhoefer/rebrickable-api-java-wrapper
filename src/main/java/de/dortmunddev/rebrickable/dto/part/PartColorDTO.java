package de.dortmunddev.rebrickable.dto.part;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PartColorDTO {
    @JsonProperty("color_id")
    private int colorId;

    @JsonProperty("color_name")
    private String colorName;

    @JsonProperty("num_sets")
    private int numSets;

    @JsonProperty("num_set_parts")
    private int numSetParts;

    @JsonProperty("part_img_url")
    private String partImgUrl;

    private List<String> elements;
}