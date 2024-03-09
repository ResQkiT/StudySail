package org.resk.studysail.controllers;

import org.resk.studysail.dto.UserDTO;
import org.resk.studysail.model.User;
import org.resk.studysail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("StudySail/auth")
public class AuthController {
    UserService userService;
    @Autowired
    public AuthController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public String authPage(){
        return "authentication";
    }
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/user")
    public User createUser(@RequestBody UserDTO userModel){
        return userService.createUser(userModel.getModel());
    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(name = "id") long id){
        return userService.getUser(id);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUSer(@PathVariable(name = "id") long id){userService.deleteUser(id);}
}
