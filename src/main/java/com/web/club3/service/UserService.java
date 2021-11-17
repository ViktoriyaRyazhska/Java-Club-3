package com.web.club3.service;

import com.web.club3.dto.UserDTO;
import com.web.club3.model.User;

import java.time.LocalDate;

public interface UserService {
    int avgUserAge();

    String howLongUserWorkWithLibrary(LocalDate registrationDate, LocalDate localDate);

    UserDTO findByEmail(String email);
}
