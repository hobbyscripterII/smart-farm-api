package com.project.smartfarmapi.weather;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smartfarmapi.api.ApiResponse;
import com.project.smartfarmapi.cmmn.ResultVo;
import com.project.smartfarmapi.weather.dto.WeatherGetDto;
import com.project.smartfarmapi.weather.dto.WeatherInsDto;
import com.project.smartfarmapi.weather.vo.WeatherGetVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Tag(name = "날씨 정보 API")
@RequestMapping("/weather")
@RestController
@RequiredArgsConstructor
public class WeatherController {
	private final WeatherService service;
	
	@GetMapping
	@Operation(summary = "날씨 정보 조회 API")
	public ResponseEntity<ApiResponse<List<WeatherGetVo>>> getWeather(WeatherGetDto dto) {
		List<WeatherGetVo> vo = service.getWeather(dto);
		ApiResponse<List<WeatherGetVo>> apiResponse = ApiResponse.<List<WeatherGetVo>>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
	
	@PostMapping
	@Operation(summary = "날씨 등록 API")
	public ResponseEntity<ApiResponse<ResultVo>> insWeather(@RequestBody WeatherInsDto dto) {
		ResultVo vo = service.insWeather(dto);
		ApiResponse<ResultVo> apiResponse = ApiResponse.<ResultVo>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
}
