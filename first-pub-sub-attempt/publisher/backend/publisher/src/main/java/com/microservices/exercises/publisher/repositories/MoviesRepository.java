package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.movies.Movies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * The movies repository.
 *
 * @author Lucas Dias
 * @version 0.0.1
 * @since 2021-05-06 11:16
 */
@Repository
public interface MoviesRepository extends CrudRepository<Movies, Long> {

    List<Movies> findAll();

    Optional<Movies> findById(Long id);

    List<Movies> findByName(String name);

    List<Movies> findByReleaseDate(Date releaseDate);

    Movies save(Movies game);
}
