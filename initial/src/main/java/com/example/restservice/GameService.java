package com.example.restservice;

import java.util.List;

public interface GameService {
    List<Feedback> makeGuess(String guess);
}
