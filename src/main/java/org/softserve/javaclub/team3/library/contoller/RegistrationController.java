package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.dto.CustomerDto;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.softserve.javaclub.team3.library.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private CustomerService customerServiceImpl;

    @PostMapping("/registration")
    public ResponseEntity<String> addUser(@RequestBody CustomerDto customerDto) {
        if (!customerDto.getPassword().equals(customerDto.getConfirmPassword())) {
            return new ResponseEntity<>("Passwords do not match", HttpStatus.BAD_REQUEST);
        }
        if (!customerServiceImpl.saveUser(customerDto)) {
           return new ResponseEntity<>( "A user with the same name already exists", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Registration successfully", HttpStatus.OK);
    }
}
