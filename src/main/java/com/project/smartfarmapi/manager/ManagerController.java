package com.project.smartfarmapi.manager;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.smartfarmapi.api.ApiResponse;
import com.project.smartfarmapi.cmmn.ResultVo;
import com.project.smartfarmapi.manager.dto.ManagerGetDto;
import com.project.smartfarmapi.manager.dto.ManagerInsDto;
import com.project.smartfarmapi.manager.dto.ManagerSelDto;
import com.project.smartfarmapi.manager.dto.ManagerUpdDto;
import com.project.smartfarmapi.manager.vo.ManagerGetVo;
import com.project.smartfarmapi.manager.vo.ManagerSelVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Tag(name = "매니저 관리 API")
@RequestMapping("/manager")
@RequiredArgsConstructor
public class ManagerController {
	private final ManagerService service;
	
	@GetMapping
	@Operation(summary = "매니저 목록 조회 API")
	public ResponseEntity<ApiResponse<List<ManagerGetVo>>> getManager(ManagerGetDto dto) {
		List<ManagerGetVo> vo = service.getManager(dto);
		ApiResponse<List<ManagerGetVo>> apiResponse = ApiResponse.<List<ManagerGetVo>>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
	
	@GetMapping("/detail")
	@Operation(summary = "매니저 정보 조회 API")
	public ResponseEntity<ApiResponse<ManagerSelVo>> selManager(ManagerSelDto dto) {
		ManagerSelVo vo = service.selManager(dto);
		ApiResponse<ManagerSelVo> apiResponse = ApiResponse.<ManagerSelVo>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
	
	@PostMapping
	@Operation(summary = "매니저 등록 API")
	public ResponseEntity<ApiResponse<ResultVo>> insManager(ManagerInsDto dto) {
		ResultVo vo = service.insManager(dto);
		ApiResponse<ResultVo> apiResponse = ApiResponse.<ResultVo>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
	
	@PatchMapping
	@Operation(summary = "매니저 정보 수정 API")
	public ResponseEntity<ApiResponse<ResultVo>> updManager(ManagerUpdDto dto) {		ResultVo vo = service.updManager(dto);
		ApiResponse<ResultVo> apiResponse = ApiResponse.<ResultVo>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
}
