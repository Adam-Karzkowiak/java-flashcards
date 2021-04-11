DROP TABLE IF EXISTS flashcards;
CREATE TABLE flashcards(
                      id INT GENERATED ALWAYS AS IDENTITY,
                      question VARCHAR(255) NOT NULL ,
                      answer VARCHAR(1000) NOT NULL
);