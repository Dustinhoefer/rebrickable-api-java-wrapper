package de.dortmunddev.rebrickable.dto.minifig;

import lombok.Data;

import java.util.List;

@Data
public class InventoryResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<InventoryItemDTO> results;
}