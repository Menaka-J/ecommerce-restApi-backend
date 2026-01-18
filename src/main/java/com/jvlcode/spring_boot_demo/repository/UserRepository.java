package com.jvlcode.spring_boot_demo.repository;

import com.jvlcode.spring_boot_demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<UserEntity, Long> {
}

//repository is used between controller and entity
