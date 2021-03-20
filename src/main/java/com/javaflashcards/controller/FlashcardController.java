package com.javaflashcards.controller;

import com.javaflashcards.model.Flashcard;
import com.javaflashcards.model.dto.FlashcardQuestionReadModel;
import com.javaflashcards.service.FlashcardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class FlashcardController {

    private FlashcardService flashcardService;
    private static final Logger logger = LoggerFactory.getLogger(FlashcardController.class);


    @Autowired
    FlashcardController(final FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @PostMapping("/flashcards")
    public ResponseEntity<Flashcard> createNewFlashcard(@RequestBody Flashcard model) {
        Flashcard savedFlashcard = flashcardService.saveEntity(model);
        return ResponseEntity.created(URI.create("/" + savedFlashcard.getId())).body(savedFlashcard);
    }

    @GetMapping("/flashcards")
    public ResponseEntity<FlashcardQuestionReadModel> randomFlashcardQuestion() {
        return ResponseEntity.ok(flashcardService.randomFlashcard());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flashcard>> getAll() {
        logger.warn("Exposing all flashcards!");
        return ResponseEntity.ok(flashcardService.showAllFlashcards());
    }

    @GetMapping("/flashcards/{id}")
    public ResponseEntity<Flashcard> getFlashcardById(@PathVariable int id) {
        return ResponseEntity.ok(flashcardService.findOneById(id));
    }
}
