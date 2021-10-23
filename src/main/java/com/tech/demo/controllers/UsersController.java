package com.tech.demo.controllers;


import com.tech.demo.models.User;
import com.tech.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UsersController {
    @Autowired
    private UserRepository studentRepo;

    @GetMapping("/users")
    public String listAll(Model model) {
        List<User> listUsers = studentRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
}
