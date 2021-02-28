package com.javaflashcards.model;

import javax.persistence.*;

@Table(name = "flashcards")
@Entity
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String question;
    String answer;


}
