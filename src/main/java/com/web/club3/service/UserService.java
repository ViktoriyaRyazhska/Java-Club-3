package com.web.club3.service;

import com.web.club3.dto.UserDto;
import com.web.club3.model.User;

import java.time.LocalDate;

public interface UserService {
    int avgUserAge();

    String howLongUserWorkWithLibrary(LocalDate registrationDate, LocalDate localDate);

    UserDto findByEmail(String email);
}
