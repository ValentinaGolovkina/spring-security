package ru.valensiya.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.valensiya.springsecurity.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
