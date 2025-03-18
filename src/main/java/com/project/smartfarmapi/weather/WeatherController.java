package com.project.smartfarmapi.weather;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smartfarmapi.api.ApiResponse;
import com.project.smartfarmapi.weather.dto.WeatherGetDto;
import com.project.smartfarmapi.weather.vo.WeatherGetVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Tag(name = "날씨 정보 API")
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
	private final WeatherService service;
	
	@GetMapping
	@Operation(summary = "날씨 API", description = "")
	public ResponseEntity<ApiResponse<List<WeatherGetVo>>> getWeather(@RequestBody WeatherGetDto dto) {
		log.info("dto = {}", dto);
		
		List<WeatherGetVo> vo = service.getWeather(dto);
		ApiResponse<List<WeatherGetVo>> apiResponse = ApiResponse.<List<WeatherGetVo>>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
}
