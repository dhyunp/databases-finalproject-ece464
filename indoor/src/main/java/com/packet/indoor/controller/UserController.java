package com.packet.indoor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/api/user/{id}")
    public String get_user(@PathVariable String id){
        //TODO: change return datatype
        return "get user id: " + id;
    }

    @PostMapping(value = "/api/user", consumes = "application/json", produces = "application/json")
    public String create_user(@RequestBody String user){
        //TODO: change return and body datatypes
        return "create user id: ";
    }
}
