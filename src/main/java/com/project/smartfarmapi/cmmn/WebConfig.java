package com.project.smartfarmapi.cmmn;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry corsRegistry) {
		corsRegistry
			// 모든 URL(API)에 CORS 정책 적용
			.addMapping("/**")
			
			// 허용 Origin 패턴 설정
			.allowedOriginPatterns("*")
			
			// 허용 Origin(5500 : VS Code, 8080 : Server)
			// allowedOrigins는 와일드 카드'*' 사용이 불가능하다.
			// .allowedOrigins("http://127.0.0.1:5500", "http://localhost:8080")
			
			// 허용 HTTP Method(사실 상 와일드 카드도 사용 가능하다)
			.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
			
			// 허용 HTTP Header
			.allowedHeaders("*")
			
			// 요청 시 인증 정보 포함 여부
			.allowCredentials(true);
	}
}