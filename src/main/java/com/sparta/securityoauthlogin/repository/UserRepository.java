package com.sparta.securityoauthlogin.repository;

import com.sparta.securityoauthlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
     User findByEmail(String email); //oauth 중복검사용
}
