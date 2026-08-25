package com.risklens.risklens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.risklens.risklens.service.RiskAnalyzerService;

@RestController
public class HelloController {

    private final RiskAnalyzerService riskAnalyzerService;

    public HelloController(RiskAnalyzerService riskAnalyzerService) {
        this.riskAnalyzerService = riskAnalyzerService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to RiskLens AI Project!";
    }

    @GetMapping("/analyze")
    public String analyze(@RequestParam String text) {
        return riskAnalyzerService.analyzeRisk(text);
    }
}
