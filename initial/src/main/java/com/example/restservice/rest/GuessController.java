package com.example.restservice.rest;


import com.example.restservice.model.Feedback;
import com.example.restservice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuessController {

    @Autowired
    GameService gameService;


    @GetMapping("/guess/{g}")
    public ResponseEntity<List<Feedback>> guess(@PathVariable("g") String guess) {
        return ResponseEntity.accepted()
                .body(gameService.makeGuess(guess));

    }
}
