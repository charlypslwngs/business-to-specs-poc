package com.specs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CopilotConfig {

    @Value("${github.copilot.api.key}")
    private String apiKey;

    @Value("${github.copilot.api.url}")
    private String apiUrl;

    @Bean
    public CopilotService copilotService() {
        return new CopilotService(apiKey, apiUrl);
    }
}
