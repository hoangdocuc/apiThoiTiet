package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wind {
	@JsonProperty("speed")
	private Integer speed;
	@JsonProperty("deg")
	private Integer deg;
	@JsonProperty("gust")
	private Integer gust;

}
