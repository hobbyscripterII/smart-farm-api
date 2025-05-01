package com.project.smartfarmapi.weather.dto;

import lombok.Data;

@Data
public class WeatherInsDto {
	private String regionCd;
	private String status;
	private String temperature;
	private String windPwr;
	private String windDirection;
	private String updateDttm;
	private String externIp;
	private String humidity;
}