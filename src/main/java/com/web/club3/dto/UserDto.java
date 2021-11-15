package com.web.club3.dto;

import com.web.club3.model.BookOrder;
import com.web.club3.model.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String password;
    private LocalDate date;
    private Role role;
    private List<BookOrder> bookOrderList = new ArrayList<>();
}
