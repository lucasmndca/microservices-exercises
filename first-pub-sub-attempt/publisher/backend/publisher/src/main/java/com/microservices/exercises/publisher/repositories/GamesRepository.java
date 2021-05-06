package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.games.Games;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * The games repository.
 *
 * @author Lucas Dias
 * @version 0.0.1
 * @since 2021-05-06 11:07
 */
@Repository
public interface GamesRepository extends CrudRepository<Games, Long> {

    List<Games> findAll();

    Optional<Games> findById(Long id);

    List<Games> findByName(String name);

    List<Games> findByReleaseDate(Date releaseDate);

    List<Games> findByPlatform(String platform);

    Games save(Games game);
}
