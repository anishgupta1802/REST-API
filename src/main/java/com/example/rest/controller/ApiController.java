package com.example.rest.controller;

import com.example.rest.models.user;
import com.example.rest.repo.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private userrepo userrepo;

    @GetMapping(value  ="/")
    public String getPage() {
        return "welcome";
    }

    @GetMapping(value = "/users")
    public List<user> getusers(){
        return userrepo.findAll();
    }


    @PostMapping(value = "/save")
    public String saveuser(@RequestBody user user){
        userrepo.save(user);
        return "done";
    }

    @PutMapping (value = "/update/{id}")
    public String updateuser(@PathVariable long id,@RequestBody user user){
        user update=userrepo.findById(id).get();
        update.setFirstName(user.getFirstName());
        update.setLastName(user.getLastName());
        update.setOccupation(user.getOccupation());
        update.setage(user.getage());
        userrepo.save(update);
        return "updated..";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteuser(@PathVariable long id){
        user deluser=userrepo.findById(id).get();
        userrepo.delete(deluser);
        return "deleted user : "+ id;
    }

}
