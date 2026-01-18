package com.jvlcode.spring_boot_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") //will create table "users" in ds for use
public class UserEntity {

    @Id //for generating unique for id for each row in db
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tell to create unique id for id generation
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


    //default constructor
    public UserEntity() {
        super();
    }
}

//entity is like table creating annotation
//it will create table in db with defined columns