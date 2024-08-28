package de.dortmunddev.rebrickable.dto.part;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PartDetailsDTO {
    @JsonProperty("part_img_url")
    private String partImgUrl;

    @JsonProperty("year_from")
    private int yearFrom;

    @JsonProperty("year_to")
    private int yearTo;

    @JsonProperty("num_sets")
    private int numSets;

    @JsonProperty("num_set_parts")
    private int numSetParts;

    private List<String> elements;
}
