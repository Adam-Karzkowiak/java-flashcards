package com.javaflashcards.controller;

import com.javaflashcards.service.FlashcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlashcardController {

    private FlashcardService flashcardService;

    @Autowired
    FlashcardController(final FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }
}
