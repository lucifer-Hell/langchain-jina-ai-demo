package com.JinaAiLangchainDemo.JinaAi.controller;

import com.JinaAiLangchainDemo.JinaAi.service.JinaAiService;
import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.output.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class JinaAiController {
    @Autowired
    JinaAiService jinaAiService;
    @PostMapping("/get-embeddings")
    public ResponseEntity<Embedding> getEmbeddingForInput(@RequestBody HashMap<String,String> body){
        return ResponseEntity.ok(jinaAiService.getEmbeddingsFromInput(body.get("input")));
    }
}
