package com.project.smartfarmapi.region;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.smartfarmapi.region.dto.RegionGetDto;
import com.project.smartfarmapi.region.vo.RegionGetVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegionService {
	private final RegionMapper mapper;
	
	public List<RegionGetVo> getRegion(RegionGetDto dto) {
		String regionCodes = dto.getRegionCodes();
		
		for(String regionCd : regionCodes.split(";")) {
			log.info("regionCd = {}", regionCd);
			
			dto.getRegionList().add(regionCd);
		}
		
		return mapper.getRegion(dto);
	}
}
