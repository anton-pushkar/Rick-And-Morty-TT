package mateacademy.springboot.rickandmortyapp.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.stream.Collectors;
import mateacademy.springboot.rickandmortyapp.dto.external.CharacterResponseDto;
import mateacademy.springboot.rickandmortyapp.dto.mapper.MovieCharacterMapper;
import mateacademy.springboot.rickandmortyapp.model.MovieCharacter;
import mateacademy.springboot.rickandmortyapp.service.MovieCharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-character")
public class MovieController {
    private final MovieCharacterService service;
    private final MovieCharacterMapper mapper;

    public MovieController(MovieCharacterService service,
                           MovieCharacterMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/random")
    @ApiOperation(value = "Get random character from API")
    public CharacterResponseDto getRandom() {
        MovieCharacter randomCharacter = service.getRandomCharacter();
        return mapper.toResponseDto(randomCharacter);
    }

    @GetMapping("/by-name")
    @ApiOperation(value = "Get characters that contains \"namePart\" in character name")
    public List<CharacterResponseDto> getByName(@RequestParam
                                                    @ApiParam(value = "Name to search")
                                                String name) {
        return service.findAllByNameContains(name)
                .stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
