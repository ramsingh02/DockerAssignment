package com.docker.github.actions.repository;


import com.docker.github.actions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
