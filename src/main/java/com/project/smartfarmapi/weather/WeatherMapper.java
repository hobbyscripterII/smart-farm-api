package com.project.smartfarmapi.weather;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.smartfarmapi.weather.dto.WeatherGetDto;
import com.project.smartfarmapi.weather.vo.WeatherGetVo;

@Mapper
public interface WeatherMapper {
	public List<WeatherGetVo> getWeather(WeatherGetDto dto);
}
