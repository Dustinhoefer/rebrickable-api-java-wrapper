package de.dortmunddev.rebrickable.dto.part;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PartSetDTO {
    @JsonProperty("set_num")
    private String setNum;

    private String name;

    private int year;

    @JsonProperty("theme_id")
    private int themeId;

    @JsonProperty("num_parts")
    private int numParts;

    @JsonProperty("set_img_url")
    private String setImgUrl;

    @JsonProperty("set_url")
    private String setUrl;

    @JsonProperty("last_modified_dt")
    private String lastModifiedDt;
}