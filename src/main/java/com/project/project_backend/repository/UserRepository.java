package com.project.project_backend.repository;

import com.project.project_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();
}
