package com.JinaAiLangchainDemo.JinaAi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "jina")
public class JinaAiModelProperties {
    private String apiKey;
}
