package com.project.smartfarmapi.region;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smartfarmapi.api.ApiResponse;
import com.project.smartfarmapi.region.dto.RegionGetDto;
import com.project.smartfarmapi.region.vo.RegionGetVo;
import com.project.smartfarmapi.region.vo.RootRegionGetVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Tag(name = "지역 정보 API")
@RequestMapping("/region")
@RequiredArgsConstructor
public class RegionController {
	private final RegionService service;
	
	@GetMapping
	@Operation(summary = "지역 정보 API", description = "설명 : 지역 코드 ';'로 구분합니다.")
	public ResponseEntity<ApiResponse<List<RegionGetVo>>> getRegion(@RequestBody RegionGetDto dto) {
		List<RegionGetVo> vo = service.getRegion(dto);
		ApiResponse<List<RegionGetVo>> apiResponse = ApiResponse.<List<RegionGetVo>>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
	
	@GetMapping("/root")
	@Operation(summary = "루트 계정 지역 정보 API")
	public ResponseEntity<ApiResponse<List<RootRegionGetVo>>> getRootRegion() {
		List<RootRegionGetVo> vo = service.getRootRegion();
		ApiResponse<List<RootRegionGetVo>> apiResponse = ApiResponse.<List<RootRegionGetVo>>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}
}
