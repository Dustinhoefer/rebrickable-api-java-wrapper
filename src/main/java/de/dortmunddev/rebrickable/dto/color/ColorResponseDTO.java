package de.dortmunddev.rebrickable.dto.color;

import lombok.Data;

import java.util.List;

@Data
public class ColorResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<ColorDTO> results;

}

