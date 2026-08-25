package com.risklens.risklens.service;

import org.springframework.stereotype.Service;

@Service
public class RiskAnalyzerService {

    public String analyzeRisk(String text) {
        return "Analyzing: " + text;
    }
}
