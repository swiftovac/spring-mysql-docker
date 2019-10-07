package rs.dcloud.springmysqldockerized.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.dcloud.springmysqldockerized.model.User;
import rs.dcloud.springmysqldockerized.repo.UserRepo;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class HelloController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public String hello() {
        return "Hello from api v-1";
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userRepo.save(user);
    }

}



