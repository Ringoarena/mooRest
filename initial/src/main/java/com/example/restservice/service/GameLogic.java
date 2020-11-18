package com.example.restservice.service;

public interface GameLogic {
    String generateAnswer();

    String getFeedback(String answer, String guess);
}
