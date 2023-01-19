package mateacademy.springboot.rickandmortyapp.dto.mapper;

import mateacademy.springboot.rickandmortyapp.dto.ApiCharacterDto;
import mateacademy.springboot.rickandmortyapp.dto.external.CharacterResponseDto;
import mateacademy.springboot.rickandmortyapp.model.Gender;
import mateacademy.springboot.rickandmortyapp.model.MovieCharacter;
import mateacademy.springboot.rickandmortyapp.model.Status;
import org.springframework.stereotype.Component;

@Component

public class MovieCharacterMapper {
    public MovieCharacter toModel(ApiCharacterDto dto) {
        MovieCharacter movieCharacter = new MovieCharacter();
        movieCharacter.setName(dto.getName());
        movieCharacter.setGender(Gender.valueOf(dto.getGender().toUpperCase()));
        movieCharacter.setStatus(Status.valueOf(dto.getStatus().toUpperCase()));
        movieCharacter.setExternalId(dto.getId());
        return movieCharacter;
    }

    public CharacterResponseDto toResponseDto(MovieCharacter character) {
        CharacterResponseDto dto = new CharacterResponseDto();
        dto.setId(character.getId());
        dto.setExternalId(character.getExternalId());
        dto.setName(character.getName());
        dto.setStatus(character.getStatus());
        dto.setGender(character.getGender());
        return dto;
    }
}
