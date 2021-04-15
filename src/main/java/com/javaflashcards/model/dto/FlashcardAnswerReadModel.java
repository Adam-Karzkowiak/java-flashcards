package com.javaflashcards.model.dto;

public class FlashcardAnswerReadModel {
    String answer;

    private FlashcardAnswerReadModel(String answer){
        this.answer=answer;
    }

    public static FlashcardAnswerReadModel create(String answer){
        return new FlashcardAnswerReadModel(answer);
    }
}
