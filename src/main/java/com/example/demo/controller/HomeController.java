package com.example.demo.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.dto.ResponseThoiTiet;
import com.example.demo.dto.ThoiTiet;
import com.example.demo.dto.request.DauVaoAPI;
import org.apache.catalina.mapper.Mapper;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@Slf4j
public class HomeController {
	
	@GetMapping("/api")
	public ResponseEntity<ResponseThoiTiet> getAPI(@RequestParam("id") Integer id,
												   @RequestParam("appid") String appid,
												   @RequestParam("lang") String lang) {
		String url = "http://api.openweathermap.org/data/2.5/weather";
//		ThoiTiet object = restTemplate.getForObject(url, ThoiTiet.class);
//		return object;
		RestTemplate restTemplate1 = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		HttpEntity<DauVaoAPI> entity = new HttpEntity<DauVaoAPI>(headers);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("id", id)
				.queryParam("appid", appid)
				.queryParam("lang", lang);

	      ThoiTiet thoiTiet = restTemplate1.exchange(builder.toUriString(), HttpMethod.GET, entity, ThoiTiet.class).getBody();
	      ResponseThoiTiet responseThoiTiet = new ResponseThoiTiet();
	      responseThoiTiet.setName("Thành Phố " + thoiTiet.getName());
	      responseThoiTiet.setDescription("Hiện tại đang "+ thoiTiet.getWeather().get(0).getDescription());
	      responseThoiTiet.setSpeed("Tốc độ gió "+ thoiTiet.getWind().getSpeed()+" m/s");
	      responseThoiTiet.setTemp("Nhiệt độ(Kelvin) "+ thoiTiet.getMain().getTemp());
	      responseThoiTiet.setHumidity("Độ ẩm "+thoiTiet.getMain().getHumidity()+"%");
	      return ResponseEntity.status(HttpStatus.OK).body(responseThoiTiet);
	}

	@GetMapping("/test")
	public ResponseEntity<String> getTest(){
		return ResponseEntity.ok("hello");
	}

}
