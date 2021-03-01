package com.javaflashcards.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "flashcards")
@Entity
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    String question;
    @NotNull
    String answer;


}
