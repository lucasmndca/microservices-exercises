package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.user.UserGames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The UserGames repository.
 *
 * @author Lucas Dias
 * @version 0.0.1
 * @since 2021-05-06 11:25
 */
@Repository
public interface UserGamesRepository extends CrudRepository<UserGames, Long> {

    List<UserGames> findByUserId(Long userId);

    List<UserGames> findByGameId(Long gameId);
}
