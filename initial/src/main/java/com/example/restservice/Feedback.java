package com.example.restservice;

public class Feedback {
    String guess;
    String feedback;
    boolean isCorrect;

    public Feedback(String guess, String feedback, boolean isCorrect) {
        this.guess = guess;
        this.feedback = feedback;
        this.isCorrect = isCorrect;
    }

    public Feedback() {
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
