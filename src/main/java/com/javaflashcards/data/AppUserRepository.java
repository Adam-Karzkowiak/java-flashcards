package com.javaflashcards.data;

import com.javaflashcards.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    AppUser findByUsername(String username);

    boolean existsById(Long id);

    AppUser save(AppUser entity);

    void deleteById(Integer id);

    AppUser getOne(int id);
}
