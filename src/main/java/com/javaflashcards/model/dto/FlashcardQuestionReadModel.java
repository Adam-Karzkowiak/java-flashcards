package com.javaflashcards.model.dto;

public class FlashcardQuestionReadModel {
    String question;

    private FlashcardQuestionReadModel(String question) {
        this.question = question;
    }

    public static FlashcardQuestionReadModel create(String question) {
        return new FlashcardQuestionReadModel(question);
    }
}
