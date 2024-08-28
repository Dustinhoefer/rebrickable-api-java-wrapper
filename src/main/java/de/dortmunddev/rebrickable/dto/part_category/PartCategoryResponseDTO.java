package de.dortmunddev.rebrickable.dto.part_category;

import lombok.Data;

import java.util.List;

@Data
public class PartCategoryResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<PartCategoryDTO> results;
}

