package com.example.demo.dto.request;

import com.example.demo.dto.Coord;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DauVaoAPI {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("appid")
    private String appid;
    @JsonProperty("lang")
    private String lang;
}
