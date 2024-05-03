package com.example.controllers;

import com.example.models.Login;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {

    @Autowired
    LoginService ls;

    @GetMapping("/getlog")
    public List<Login> getAll(){
        return ls.getAll();
    }
}
