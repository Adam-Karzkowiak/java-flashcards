package com.javaflashcards.data;


import com.javaflashcards.model.Flashcard;
import com.javaflashcards.model.dto.FlashcardWriteModel;

public interface FlashcardRepository {
    Flashcard save(FlashcardWriteModel model);

    Flashcard delete(int id);

    Flashcard random();
}
