package com.project.smartfarmapi.manager;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.smartfarmapi.manager.dto.ManagerSelDto;
import com.project.smartfarmapi.manager.vo.ManagerGetVo;
import com.project.smartfarmapi.manager.vo.ManagerSelVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManagerService {
	private final ManagerMapper mapper;
	
	public List<ManagerGetVo> getManager() {
		return mapper.getManager();
	}
	
	public ManagerSelVo selManager(ManagerSelDto dto) {
		return mapper.selManager(dto);
	}
}