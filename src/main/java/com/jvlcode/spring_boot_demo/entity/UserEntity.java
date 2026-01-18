package com.jvlcode.spring_boot_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    //    constructor for initialization
    public UserEntity(Long id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public UserEntity() {
        super();
    }
}
