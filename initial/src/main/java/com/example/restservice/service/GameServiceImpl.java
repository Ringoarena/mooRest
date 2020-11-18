package com.example.restservice.service;

import com.example.restservice.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class GameServiceImpl implements GameService {

    @Autowired
    GameLogic gameLogic;
    String answer;
    List<Feedback> history;

    @PostConstruct
    void initiate() {
        generateAnswer();
        history = new ArrayList<>();
    }

    @Override
    public List<Feedback> makeGuess(String guess) {
        String feedback = gameLogic.getFeedback(answer, guess);
        boolean isCorrect = validate(guess);
        if (isCorrect) {
            generateAnswer();
        }
        history.add(new Feedback(guess, feedback, isCorrect));
        return history;
    }

    private void generateAnswer() {
        answer = gameLogic.generateAnswer();
        System.out.println("Generated answer: " + answer);
    }

    boolean validate(String guess) {
        return guess.equals(answer);
    }
}
