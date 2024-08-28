package de.dortmunddev.rebrickable.dto.part;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PartDTO {
    @JsonProperty("part_num")
    private String partNum;

    private String name;

    @JsonProperty("part_cat_id")
    private int partCatId;

    @JsonProperty("year_from")
    private int yearFrom;

    @JsonProperty("year_to")
    private int yearTo;

    @JsonProperty("part_url")
    private String partUrl;

    @JsonProperty("part_img_url")
    private String partImgUrl;

    private List<?> prints;
    private List<?> molds;
    private List<?> alternates;

    @JsonProperty("external_ids")
    private Map<String, List<String>> externalIds;

    @JsonProperty("print_of")
    private String printOf;
}