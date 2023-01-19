package mateacademy.springboot.rickandmortyapp.service;

import java.util.List;
import mateacademy.springboot.rickandmortyapp.model.MovieCharacter;

public interface MovieCharacterService {
    void syncExternalCharacters();

    MovieCharacter getRandomCharacter();

    List<MovieCharacter> findAllByNameContains(String name);
}
