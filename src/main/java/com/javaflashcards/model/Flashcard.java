package com.javaflashcards.model;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "flashcards")
@Entity
@Data
@NoArgsConstructor
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    String question;
    @NotNull
    String answer;

    public Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

}
