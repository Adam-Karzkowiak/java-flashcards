package com.javaflashcards.controller;

import com.javaflashcards.model.Flashcard;
import com.javaflashcards.model.dto.FlashcardWriteModel;
import com.javaflashcards.service.FlashcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class FlashcardController {

    private FlashcardService flashcardService;

    @Autowired
    FlashcardController(final FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @PostMapping("/flashcards")
    ResponseEntity<Flashcard> createNewFlashcard(@RequestBody Flashcard model){
        Flashcard savedFlashcard = flashcardService.saveEntity(model);
        return ResponseEntity.created(URI.create("/"+savedFlashcard.getId())).body(savedFlashcard);
    }
}
