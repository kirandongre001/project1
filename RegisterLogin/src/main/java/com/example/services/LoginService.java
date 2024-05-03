package com.example.services;

import com.example.models.Login;
import com.example.repos.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired(required=true)
    LoginRepo lr;

    public List<Login> getAll() {
        return lr.findAll();

    }

    public Login save(Login l) {
        return lr.save(l);
    }
}
