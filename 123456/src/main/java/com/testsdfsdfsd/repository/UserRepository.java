package com.testsdfsdfsd.repository;

import org.springframework.data.repository.CrudRepository;
import com.testsdfsdfsd.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    void deleteByUsername(String username);

}