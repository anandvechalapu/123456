package com.testsdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testsdfsdfsd.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    void deleteByUsername(String username);
    void deleteByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}