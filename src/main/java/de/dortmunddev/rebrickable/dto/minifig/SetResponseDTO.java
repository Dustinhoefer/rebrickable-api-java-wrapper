package de.dortmunddev.rebrickable.dto.minifig;

import lombok.Data;

import java.util.List;

@Data
public class SetResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<SetDTO> results;
}