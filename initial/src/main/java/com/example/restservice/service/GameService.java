package com.example.restservice.service;

import com.example.restservice.model.Feedback;

import java.util.List;

public interface GameService {
    List<Feedback> makeGuess(String guess);
}
