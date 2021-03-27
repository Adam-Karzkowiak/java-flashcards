package com.javaflashcards.model.dto;

import lombok.Data;

@Data
public class FlashcardQuestionReadModel {
    final int id;
    final String question;

    private FlashcardQuestionReadModel(final int id, String question) {
        this.id = id;
        this.question = question;
    }

    public static FlashcardQuestionReadModel create(int id, String question) {
        return new FlashcardQuestionReadModel(id, question);
    }
}
