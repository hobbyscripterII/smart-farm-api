package com.project.smartfarmapi.weather.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WeatherGetDto {
	@Schema(description = "일자", defaultValue = "${default.today.date}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public LocalDate date = LocalDate.now();
	
	@Schema(description = "지역 코드")
	public String regionCode;
}