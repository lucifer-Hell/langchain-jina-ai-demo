package com.JinaAiLangchainDemo.JinaAi.config;

import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.jina.JinaEmbeddingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JinaAiModelConfig {
    @Autowired
    JinaAiModelProperties jinaAiModelProperties;
    @Bean
    EmbeddingModel embeddingModel(){
        return JinaEmbeddingModel.withApiKey(jinaAiModelProperties.getApiKey());
    }
}
