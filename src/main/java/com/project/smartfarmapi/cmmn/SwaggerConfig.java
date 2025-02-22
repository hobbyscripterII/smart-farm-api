package com.project.smartfarmapi.cmmn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {
	@Value("${spring.config.activate.on-profile}")
	private String activeProfile;
	
	@Value("${swagger.base-url}")
	private String baseUrl;
	
	@Bean
	public OpenAPI openAPI() {
		List<Server> servers = new ArrayList<Server>();
		servers.add(new Server().url(baseUrl));
		
		return new OpenAPI()
				.components(new Components())
				.info(apiInfo())
				.servers(servers);
	}
	
	private Info apiInfo() {
		return new Info()
				.title("SMART FARM API")
				.description("<strong>SMART FARM API Interface Docs!</strong> (" + activeProfile + " SERVER)")
				.version("1.0.0");
	}
}
