package org.softserve.javaclub.team3.library.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private String username;
    private String password;
    private String confirmPassword;
    private int age;
}
