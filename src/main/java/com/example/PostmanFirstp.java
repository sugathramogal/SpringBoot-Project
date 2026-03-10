package com.example;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostmanFirstp {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Postman!";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {

        return "Name: " + user.getName() +
               ", Age: " + user.getAge() +
               ", City: " + user.getCity();
    }
    
    @PostMapping("/users")
    public String createUsers(@RequestBody List<User> users) {

        String result = "";

        for (User user : users) {
            result += "Name: " + user.getName() +
                      ", Age: " + user.getAge() +
                      ", City: " + user.getCity() + "\n";
        }

        return result;
    }
    @GetMapping("/userss/{id}")
    public String getUserById(@PathVariable int id) {
        return "User ID is: " + id;
    }



}
