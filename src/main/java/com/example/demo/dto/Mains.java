package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mains {
	@JsonProperty("temp")
	private Integer temp;
	@JsonProperty("feels_like")
	private Integer feels_like;
	@JsonProperty("temp_min")
	private Integer temp_min;
	@JsonProperty("temp_max")
	private Integer temp_max;
	@JsonProperty("pressure")
	private Integer pressure;
	@JsonProperty("humidity")
	private Integer humidity;
	@JsonProperty("sea_level")
	private Integer sea_level;
	@JsonProperty("grnd_level")
	private Integer grnd_level;
}
