package com.microservices.exercises.publisher.repositories;

import com.microservices.exercises.publisher.entities.role.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * The role repository.
 *
 * @author Lucas Dias
 * @version 0.0.1
 * @since 2021-05-06 10:34
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findAll();

    Optional<Role> findById(Long id);

    List<Role> findByType(String type);

    Role save(Role role);

    void delete(Role role);
}
