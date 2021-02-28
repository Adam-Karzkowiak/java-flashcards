package com.javaflashcards.data;

import com.javaflashcards.model.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SqlFlashcardRepository extends FlashcardRepository, JpaRepository<Integer, Flashcard> {
}
