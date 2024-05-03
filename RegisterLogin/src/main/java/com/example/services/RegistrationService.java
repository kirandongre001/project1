package com.example.services;

import com.example.models.Registration;
import com.example.repos.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepo rr;
    public List<Registration> getRegister() {
        return rr.findAll();
    }

    public Registration saveUser(Registration r) {
        return rr.save(r);
    }
}
