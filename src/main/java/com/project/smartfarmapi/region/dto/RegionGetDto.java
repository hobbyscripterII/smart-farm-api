package com.project.smartfarmapi.region.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class RegionGetDto {
	private String regionCodes;
	@JsonIgnore
	private List<String> regionList = new ArrayList<String>();
}
