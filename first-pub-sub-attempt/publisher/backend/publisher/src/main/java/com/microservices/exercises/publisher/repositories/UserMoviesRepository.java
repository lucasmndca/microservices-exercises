package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.user.UserMovies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The UserMovies repository.
 *
 * @author Lucas Dias
 * @version 0.0.1
 * @since 2021-05-06 11:19
 */
@Repository
public interface UserMoviesRepository extends CrudRepository<UserMovies, Long> {

    List<UserMovies> findByUserId(Long userId);

    List<UserMovies> findByMovieId(Long movieId);
}
