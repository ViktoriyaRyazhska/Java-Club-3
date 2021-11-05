package com.web.club3.service;

import java.time.LocalDate;

public interface UserService {
    int avgUserAge();

    String howLongUserWorkWithLibrary(LocalDate registrationDate, LocalDate localDate);
}
