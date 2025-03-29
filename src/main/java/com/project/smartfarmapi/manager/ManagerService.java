package com.project.smartfarmapi.manager;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.smartfarmapi.cmmn.ResultVo;
import com.project.smartfarmapi.manager.dto.ManagerGetDto;
import com.project.smartfarmapi.manager.dto.ManagerInsDto;
import com.project.smartfarmapi.manager.dto.ManagerSelDto;
import com.project.smartfarmapi.manager.dto.ManagerUpdDto;
import com.project.smartfarmapi.manager.vo.ManagerGetVo;
import com.project.smartfarmapi.manager.vo.ManagerSelVo;
import com.project.smartfarmapi.region.RegionMapper;
import com.project.smartfarmapi.region.vo.RootRegionGetVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ManagerService {
	private final ManagerMapper ManagerMapper;
	private final RegionMapper regionMapper;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public List<ManagerGetVo> getManager(ManagerGetDto dto) {
		return ManagerMapper.getManager(dto);
	}
	
	public ManagerSelVo selManager(ManagerSelDto dto) {
		ManagerSelVo vo = ManagerMapper.selManager(dto);
		List<RootRegionGetVo> rootRegionInfo = regionMapper.getRootRegion();
		vo.setRootRegionInfo(rootRegionInfo);
		
		return vo;
	}
	
	public ResultVo insManager(ManagerInsDto dto) {
		String pwd = dto.getPwd();
		
		if(pwd != null) {
			String hashedPwd = bCryptPasswordEncoder.encode(pwd);
			dto.setPwd(hashedPwd);
		}
		
		return new ResultVo(ManagerMapper.insManager(dto));
	}
	
	public ResultVo updManager(ManagerUpdDto dto) {
		String pwd = dto.getPwd();
		
		if(pwd != null) {
			String hashedPwd = bCryptPasswordEncoder.encode(pwd);
			dto.setPwd(hashedPwd);
		}
		
		return new ResultVo(ManagerMapper.updManager(dto));
	}
}