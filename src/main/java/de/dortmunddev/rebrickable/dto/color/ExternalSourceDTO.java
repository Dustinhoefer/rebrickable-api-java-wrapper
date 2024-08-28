package de.dortmunddev.rebrickable.dto.color;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ExternalSourceDTO {
    @JsonProperty("ext_ids")
    private List<Integer> extIds;

    @JsonProperty("ext_descrs")
    private List<List<String>> extDescrs;

}