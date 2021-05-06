package com.microservices.exercises.publisher.entities.games;

import javax.persistence.*;
import java.util.Date;

/**
 * The games entity.
 * @author Lucas Dias
 * @since 2021-05-05 20:56
 */
@Entity
@Table(name = "games")
public class Games {

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
    private String platform;

    @Basic
    @Column(nullable = false)
    private String description;

    @Column
    private String coverUrl;

    @Column
    private Date releaseDate;

    protected Games() {}

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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
