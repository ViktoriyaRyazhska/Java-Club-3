package org.softserve.javaclub.team3.library.contoller;

import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.softserve.javaclub.team3.library.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    private SecurityService securityServiceImpl;
    @Autowired
    private CustomerService customerServiceImpl;

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        Customer customer = customerServiceImpl.findUserByUsername(username);
        if(!customerServiceImpl.validatePassword(password, customer.getPassword())){
            return new ResponseEntity<>("Wrong password", HttpStatus.BAD_REQUEST);
        }
        String token = securityServiceImpl.getJwtToken(username);
        customer.setToken(token);
        return new ResponseEntity<>(customer.getToken(),HttpStatus.OK);
    }
}