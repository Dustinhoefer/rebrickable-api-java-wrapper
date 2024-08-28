package de.dortmunddev.rebrickable.dto.part_category;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PartCategoryDTO {
    private int id;
    private String name;

    @JsonProperty("part_count")
    private int partCount;
}