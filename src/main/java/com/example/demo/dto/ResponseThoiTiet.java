package com.example.demo.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseThoiTiet {
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("speed")
	private String speed;
	@JsonProperty("temp")
	private String temp;
	@JsonProperty("humidity")
	private String humidity;
}
