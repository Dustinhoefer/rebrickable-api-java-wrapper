package de.dortmunddev.rebrickable.dto.minifig;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import de.dortmunddev.rebrickable.dto.part.PartDTO;
import lombok.Data;

@Data
public class InventoryItemDTO {
    private int id;

    @JsonProperty("inv_part_id")
    private int invPartId;

    private PartDTO part;
    private ColorDTO color;

    @JsonProperty("set_num")
    private String setNum;

    private int quantity;

    @JsonProperty("is_spare")
    private boolean isSpare;

    @JsonProperty("element_id")
    private String elementId;

    @JsonProperty("num_sets")
    private int numSets;
}