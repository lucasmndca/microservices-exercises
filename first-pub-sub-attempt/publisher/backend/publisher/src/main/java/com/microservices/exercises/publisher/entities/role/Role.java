package com.microservices.exercises.publisher.entities.role;

import javax.persistence.*;

/**
 * The role entity.
 * @author Lucas Dias
 * @since 2021-05-05 20:48
 */
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(nullable = false)
    private String type;

    protected Role() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
