package com.project.smartfarmapi.region;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.smartfarmapi.region.dto.RegionGetDto;
import com.project.smartfarmapi.region.vo.RegionGetVo;
import com.project.smartfarmapi.region.vo.RootRegionGetVo;

@Mapper
public interface RegionMapper {
	public List<RegionGetVo> getRegion(RegionGetDto dto);
	public List<RootRegionGetVo> getRootRegion();
}
