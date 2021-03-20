package com.javaflashcards.data;


import com.javaflashcards.model.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Integer> {
    Flashcard save(Flashcard model);

    Optional<Flashcard> findById(Integer id);

    long count();

    List<Flashcard> findAll();
}
