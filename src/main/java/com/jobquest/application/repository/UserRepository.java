package com.jobquest.application.repository;

import com.jobquest.application.entity.JobListing;
import com.jobquest.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    boolean existsByEmail(String email);
}
