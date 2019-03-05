package com.savaleks.springdemo.repository;

import com.savaleks.springdemo.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);
}
