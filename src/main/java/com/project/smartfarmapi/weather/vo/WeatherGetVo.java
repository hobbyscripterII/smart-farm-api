package com.project.smartfarmapi.weather.vo;

import lombok.Data;

@Data
public class WeatherGetVo {
	private String status;
	private String temperature;
	private String windPwr;
	private String windDirection;
	private String updateDttm;
	private String humidity;
	private String regionName;
}