package com.project.smartfarmapi.weather;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.smartfarmapi.weather.dto.WeatherGetDto;
import com.project.smartfarmapi.weather.dto.WeatherInsDto;
import com.project.smartfarmapi.weather.vo.WeatherGetVo;

@Mapper
public interface WeatherMapper {
	public List<WeatherGetVo> getWeather(WeatherGetDto dto);
	public int insWeather(WeatherInsDto dto);
}
