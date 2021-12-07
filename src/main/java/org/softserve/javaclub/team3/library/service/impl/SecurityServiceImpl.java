package org.softserve.javaclub.team3.library.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.softserve.javaclub.team3.library.dao.CustomerDao;
import org.softserve.javaclub.team3.library.model.Customer;
import org.softserve.javaclub.team3.library.service.CustomerService;
import org.softserve.javaclub.team3.library.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private CustomerDao customerDaoImpl;

    private static final String SECRET_KEY = "$ome$ecret";
    private static final String ROLE_ADMIN = "ROLE_ADMIN";

    @Override
    public String getJwtToken(String username) {

        List<GrantedAuthority> grantedAuthorities;
        Customer customer = customerDaoImpl.findByUsername(username);

        if(customer.getRole().stream().anyMatch(role -> role.getName().equals(ROLE_ADMIN))){
            grantedAuthorities = AuthorityUtils
                    .commaSeparatedStringToAuthorityList("ROLE_ADMIN");
        }else {
            grantedAuthorities = AuthorityUtils
                    .commaSeparatedStringToAuthorityList("ROLE_USER");
        }

        String token = Jwts
                .builder().setId("softtekJWT").setSubject(username)
                .claim("authorities", grantedAuthorities.
                        stream().
                        map(GrantedAuthority::getAuthority).
                        collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1800000))
                .signWith(SignatureAlgorithm.HS512,
                        SECRET_KEY.getBytes()).compact();

        return "Bearer " + token;

    }
}
