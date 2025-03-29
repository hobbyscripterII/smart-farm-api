package com.project.smartfarmapi.manager;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.smartfarmapi.manager.dto.ManagerSelDto;
import com.project.smartfarmapi.manager.dto.ManagerUpdDto;
import com.project.smartfarmapi.manager.vo.ManagerGetVo;
import com.project.smartfarmapi.manager.vo.ManagerSelVo;

@Mapper
public interface ManagerMapper {
	public List<ManagerGetVo> getManager();
	public ManagerSelVo selManager(ManagerSelDto dto);
	public int updManager(ManagerUpdDto dto);
}