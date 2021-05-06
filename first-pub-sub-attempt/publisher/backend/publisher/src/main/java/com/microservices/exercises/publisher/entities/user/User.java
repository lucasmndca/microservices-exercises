package com.microservices.exercises.publisher.entities.user;

import com.microservices.exercises.publisher.entities.role.Role;

import javax.persistence.*;

/**
 * The user entity
 * @author Lucas Dias
 * @since 2021-05-05 20:31
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    @Basic
    @Column(nullable = false)
    private String nome;

    @Basic
    @Column(nullable = false)
    private String email;

    @Basic
    @Column(nullable = false)
    private String password;

    @Basic
    @Column(nullable = false)
    private Long role;

    @Column
    private String city;

    @Column(length = 2)
    private String uf;

    @Column(length = 128)
    private String bios;

    protected User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role.getId();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
