package de.dortmunddev.rebrickable.dto.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import lombok.Data;

@Data
public class ElementResponseDTO {
    private PartDTO part;
    private ColorDTO color;

    @JsonProperty("element_id")
    private String elementId;

    @JsonProperty("design_id")
    private String designId;

    @JsonProperty("element_img_url")
    private String elementImgUrl;

    @JsonProperty("part_img_url")
    private String partImgUrl;
}