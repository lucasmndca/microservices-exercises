package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The user repository
 * @author Lucas Dias
 * @since 2021-05-06 09:25
 * @version 0.0.1
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

    List<User> findAll();

    User findUserById(Long id);

    User save(User user);

    void delete(User user);

}