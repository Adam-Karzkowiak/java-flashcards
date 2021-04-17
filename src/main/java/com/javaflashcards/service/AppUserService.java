package com.javaflashcards.service;

import com.javaflashcards.data.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class AppUserService {

    AppUserRepository repository;

    @Autowired
    AppUserService(final AppUserRepository repository) {
        this.repository = repository;
    }
}
