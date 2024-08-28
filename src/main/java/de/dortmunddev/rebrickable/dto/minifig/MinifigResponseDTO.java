package de.dortmunddev.rebrickable.dto.minifig;

import lombok.Data;

import java.util.List;

@Data
public class MinifigResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<MinifigDTO> results;
}