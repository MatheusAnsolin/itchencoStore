package com.itchencostore.itchencoStore.controller;

import com.itchencostore.itchencoStore.model.UserModel;
import com.itchencostore.itchencoStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserModel> listarUsuarios() {
        return userRepository.findAll();
    }
}