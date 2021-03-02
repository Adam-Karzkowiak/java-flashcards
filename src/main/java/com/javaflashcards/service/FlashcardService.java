package com.javaflashcards.service;

import com.javaflashcards.data.FlashcardRepository;
import com.javaflashcards.model.Flashcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {
    private FlashcardRepository flashcardRepository;

    @Autowired
    FlashcardService(final FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public Flashcard saveEntity(Flashcard entity) {
        return flashcardRepository.save(entity);
    }
}
