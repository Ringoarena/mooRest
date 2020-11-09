package com.example.restservice;

public interface GameLogic {
    String generateAnswer();

    String getFeedback(String answer, String guess);
}
