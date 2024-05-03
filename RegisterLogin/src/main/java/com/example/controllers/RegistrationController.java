package com.example.controllers;

import com.example.models.Login;
import com.example.models.Registration;
import com.example.services.LoginService;
import com.example.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registerlogin")
public class RegistrationController {

        @Autowired
        RegistrationService uservice;

        @Autowired
        LoginService lservice;


//        @GetMapping("/getUser")
//        public Registration getUser(@RequestParam("login_id") int login_id)
//        {
//            Login l=lservice.getById(login_id);
//            return uservice.getUser(l);
//        }

        @GetMapping("/getAllUsers")
        public List<Registration> getAllUsers()
        {
            return uservice.getRegister();
        }

        @PostMapping("/regUser")
        public Registration regUser(@RequestBody Registration ur)
        {
            Login l=new Login(ur.getEmail_id(),ur.getPassword());

            Login saved=lservice.save(l);

            Registration r=new Registration(ur.getFname(),ur.getLname(),ur.getEmail_id(),ur.getDob(),ur.getAddress(),ur.getPassword(),ur.getUser_id());
            return uservice.saveUser(r);
        }

}
