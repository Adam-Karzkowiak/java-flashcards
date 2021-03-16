package com.javaflashcards.service;

import com.javaflashcards.data.FlashcardRepository;
import com.javaflashcards.model.Flashcard;
import com.javaflashcards.model.dto.FlashcardQuestionReadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class FlashcardService {
    private final FlashcardRepository flashcardRepository;

    @Autowired
    FlashcardService(final FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public Flashcard saveEntity(Flashcard entity) {
        return flashcardRepository.save(entity);
    }

    public FlashcardQuestionReadModel randomFlashcard() {
        Random random = new Random();
        Long maxValue = flashcardRepository.count();
        int id = random.nextInt(Math.toIntExact(maxValue)) + 1;
        Flashcard flashcard = flashcardRepository.getOne(id);
        return FlashcardQuestionReadModel.create(flashcard.getQuestion());
    }
}
