package com.javaflashcards.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String question;
    String answer;


}
