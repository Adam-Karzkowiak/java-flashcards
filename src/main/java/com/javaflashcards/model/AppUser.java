package com.javaflashcards.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Entity
@Data
@Table(name = "app_users")
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String login;
    @NotNull
    private String password;
    @Email
    private String email;

    @OneToMany
    private Set<Flashcard> guessed;

    @OneToMany
    private Set<Flashcard> notGuessed;

    private AppUser(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }


    public static AppUser create(String login, String password, String email) {
        return new AppUser(login, password, email);
    }

}
