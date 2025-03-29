package com.project.smartfarmapi.manager.vo;

import java.util.List;

import com.project.smartfarmapi.region.vo.RootRegionGetVo;

import lombok.Data;

@Data
public class ManagerSelVo {
	private String id;
	private String name;
	private String tel;
	private String regionCode;
	private String regionName;
	private String useYn;
	private List<RootRegionGetVo> rootRegionInfo = null;
}