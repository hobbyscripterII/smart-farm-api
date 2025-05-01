package com.project.smartfarmapi.weather;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.smartfarmapi.cmmn.ResultVo;
import com.project.smartfarmapi.weather.dto.WeatherGetDto;
import com.project.smartfarmapi.weather.dto.WeatherInsDto;
import com.project.smartfarmapi.weather.vo.WeatherGetVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WeatherService {
	private final WeatherMapper mapper;
	
	public List<WeatherGetVo> getWeather(WeatherGetDto dto) {
		return mapper.getWeather(dto);
	}
	
	public ResultVo insWeather(WeatherInsDto dto) {
		return new ResultVo(mapper.insWeather(dto));
	}
}
