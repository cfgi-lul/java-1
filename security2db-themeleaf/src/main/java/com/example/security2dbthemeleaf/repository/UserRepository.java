package com.example.security2dbthemeleaf.repository;

import com.example.security2dbthemeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
