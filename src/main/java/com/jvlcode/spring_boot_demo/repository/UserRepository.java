package com.jvlcode.spring_boot_demo.repository;

import com.jvlcode.spring_boot_demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}

//repository is used between controller and entity
//simplify CRUD operation instead of sql queries
//have functions like save , find, delete for ease use
