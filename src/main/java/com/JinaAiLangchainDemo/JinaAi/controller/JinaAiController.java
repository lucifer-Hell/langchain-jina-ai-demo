package com.JinaAiLangchainDemo.JinaAi.controller;

import com.JinaAiLangchainDemo.JinaAi.service.JinaAiService;
import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.output.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/jina-ai")
public class JinaAiController {
    @Autowired
    JinaAiService jinaAiService;
    @PostMapping("/get-embeddings")
    public ResponseEntity<float[]> getEmbeddingForInput(@RequestBody HashMap<String,String> body){
        Embedding embeddingRepsone = jinaAiService.getEmbeddingsFromInput(body.get("input"));
        return ResponseEntity.ok(embeddingRepsone.vector());
    }
}
