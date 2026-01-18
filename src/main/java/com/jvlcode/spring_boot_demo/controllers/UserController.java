package com.jvlcode.spring_boot_demo.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jvlcode.spring_boot_demo.entity.UserEntity;
import com.jvlcode.spring_boot_demo.exceptions.ResourceNotFoundException;
import com.jvlcode.spring_boot_demo.model.User;
import com.jvlcode.spring_boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

//    @GetMapping
//    //testing /api/users works in url
//    public String getUsers() {
//        return "Hello from Menaka";
//    }

    //for showing all users in /api/users
    @GetMapping
    public List<UserEntity> getUsers() {
//        return Arrays.asList(new User(1L, "menaka", "men@gmail.com"), new User(2L, "meena", "meena@gmail.com"));
        return userRepository.findAll();
    }


    //for creating user in db
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userRepository.save(user); // it will save and return the data user entered [post data]
    }

    //for getting user by id
    @GetMapping("/{id}")  //tells the url has id in end
    public UserEntity getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    //for updating user by id
    @PutMapping("/{id}") //tells url come with a field called ID
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user) { //Path => get id from url, reqbody => get user JSON data from put request
        UserEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with this id: " + id)); //fing and save user with that id
        userData.setName(user.getName()); //change name updated
        userData.setEmail(user.getEmail()); //change updated email
        return userRepository.save(userData); //returning updated user and saving it
    }
}


//@RequestBody annoation =>
//                          is used to get the data user enter [in postman we enter JSON data]


//@PathVariable annotation =>
//                          is used to get the GET url id


//Optional<UserEntity>
//                      => if there is no data to return [like findbyig here] , it will  return NULL that's optional
//                              it will show error if no optional without try catch class


//DO ALL CRUD OPERATION IN CONTROLLERS PACKAGE