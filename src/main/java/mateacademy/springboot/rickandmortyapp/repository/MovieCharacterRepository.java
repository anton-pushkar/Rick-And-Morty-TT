package mateacademy.springboot.rickandmortyapp.repository;

import java.util.List;
import mateacademy.springboot.rickandmortyapp.model.MovieCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCharacterRepository extends JpaRepository<MovieCharacter, Long> {
    List<MovieCharacter> findAllByNameContains(String name);

    List<MovieCharacter> findAllByExternalIdIn(java.util.Set<Long> externalId);
}
