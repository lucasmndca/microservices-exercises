package com.microservices.exercises.publisher.entities.user;

import javax.persistence.*;

/**
 * The UserMovies entity.
 * @author Lucas Dias
 * @since 2021-05-05 21:19
 */
@Entity
@Table(name = "users_v_movies")
public class UserMovies {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(nullable = false)
    private Long userId;

    @Basic
    @Column(nullable = false)
    private Long movieId;

    protected UserMovies() {}

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

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
