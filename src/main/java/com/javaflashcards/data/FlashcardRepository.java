package com.javaflashcards.data;


import com.javaflashcards.model.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends JpaRepository<Integer, Flashcard> {
    Flashcard save(Flashcard model);

    Flashcard getOne(int id);

    long count();
}
