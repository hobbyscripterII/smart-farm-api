package com.project.smartfarmapi.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smartfarmapi.api.ApiResponse;
import com.project.smartfarmapi.test.vo.TestVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "테스트 API", description = "API 호출 테스트 관련 파트")
public class TestController {
	@GetMapping("/")
	@Operation(summary = "API 호출 테스트 기능", description = "")
	public ResponseEntity<ApiResponse<TestVo>> test() {
		TestVo vo = new TestVo("API 호출 테스트 완료", now());
		ApiResponse<TestVo> apiResponse = ApiResponse.<TestVo>success(vo);
		
		return ResponseEntity
				.ok(apiResponse);
	}

	private String now() {
		return LocalDateTime
				.now()
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
}