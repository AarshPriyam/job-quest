package com.jobquest.application.repository;

import com.jobquest.application.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    List<Role> findAll();
}
