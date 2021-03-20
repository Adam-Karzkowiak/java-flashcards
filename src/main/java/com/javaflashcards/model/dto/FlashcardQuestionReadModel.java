package com.javaflashcards.model.dto;

import lombok.Data;

@Data
public class FlashcardQuestionReadModel {
    final String question;

    private FlashcardQuestionReadModel(String question) {
        this.question = question;
    }

    public static FlashcardQuestionReadModel create(String question) {
        return new FlashcardQuestionReadModel(question);
    }
}
