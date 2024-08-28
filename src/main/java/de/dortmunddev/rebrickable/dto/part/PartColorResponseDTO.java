package de.dortmunddev.rebrickable.dto.part;

import lombok.Data;

import java.util.List;

@Data
public class PartColorResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<PartColorDTO> results;
}