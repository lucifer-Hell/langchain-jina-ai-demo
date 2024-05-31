package com.JinaAiLangchainDemo.JinaAi.service;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.jina.JinaEmbeddingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JinaAiService {
    @Autowired
    private EmbeddingModel embeddingModel;

    public Embedding getEmbeddingsFromInput(String input){
        return embeddingModel.embed(input).content();
    }


}
