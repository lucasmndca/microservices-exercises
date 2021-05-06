package com.microservices.exercises.publisher.entities.movies;

import javax.persistence.*;
import java.util.Date;

/**
 * The movies entity.
 * @author Lucas Dias
 * @since 2021-05-05
 */
@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(nullable = false)
    private String name;

    @Basic
    @Column(nullable = false)
    private String genre;

    @Basic
    @Column(nullable = false)
    private String description;

    @Column
    private String coverUrl;

    @Column
    private Date releaseDate;

    protected Movies() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
