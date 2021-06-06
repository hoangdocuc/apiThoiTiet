package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThoiTiet {
	@JsonProperty("coord")
	private Coord coord;
	
	@JsonProperty("weather")
	private List<Weather> weather;
	
	@JsonProperty("base")
	private String base;
	
	@JsonProperty("main")
	private Mains main;
	
	@JsonProperty("visibility")
	private Integer visibility;
	
	@JsonProperty("wind")
	private Wind wind;
	
	@JsonProperty("clouds")
	private Clouds clouds;
	
	@JsonProperty("dt")
	private String dt;
	
	@JsonProperty("sys")
	private Sys sys;
	
	@JsonProperty("timezone")
	private Integer timezone;
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("cod")
	private Integer cod;
	
}
