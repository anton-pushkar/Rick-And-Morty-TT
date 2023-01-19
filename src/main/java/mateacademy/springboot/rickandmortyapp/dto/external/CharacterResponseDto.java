package mateacademy.springboot.rickandmortyapp.dto.external;

import lombok.Data;
import mateacademy.springboot.rickandmortyapp.model.Gender;
import mateacademy.springboot.rickandmortyapp.model.Status;

@Data
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;
}
