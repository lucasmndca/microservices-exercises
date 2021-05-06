package com.microservices.exercises.publisher.entities.role;

import javax.persistence.*;

/**
 * The role entity.
 * @author Lucas Dias
 * @since 2021-05-05 20:48
 */
@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(nullable = false)
    private String type;
}
