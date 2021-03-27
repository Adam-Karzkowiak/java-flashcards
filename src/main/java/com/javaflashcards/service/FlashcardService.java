package com.javaflashcards.service;

import com.javaflashcards.data.FlashcardRepository;
import com.javaflashcards.model.Flashcard;
import com.javaflashcards.model.dto.FlashcardQuestionReadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        Flashcard flashcard = flashcardRepository.findById(id).get();
        return FlashcardQuestionReadModel.create(flashcard.getId(),flashcard.getQuestion());
    }

    public List<Flashcard> showAllFlashcards() {
        return flashcardRepository.findAll();
    }

    public Flashcard findOneById(int id) {
        return flashcardRepository.findById(id).get();
    }

}
