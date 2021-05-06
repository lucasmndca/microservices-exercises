package com.microservices.exercises.publisher.entities.user;

import javax.persistence.*;

/**
 * The UserGames entity.
 * @author Lucas Dias
 * @since 2021-05-05 21:13
 */
@Entity
@Table(name = "users_v_games")
public class UserGames {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(nullable = false)
    private Long userId;

    @Basic
    @Column(nullable = false)
    private Long gameId;

    protected UserGames() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
