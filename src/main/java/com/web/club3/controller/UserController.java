package com.web.club3.controller;

import com.web.club3.dto.BookOrderDTO;
import com.web.club3.dto.UserDTO;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;
    private final BookServiceImpl bookService;
    private final BookOrderServiceImpl bookOrderService;


    @Autowired
    public UserController(UserServiceImpl userService, BookServiceImpl bookService, BookOrderServiceImpl bookOrderService) {
        this.userService = userService;
        this.bookService = bookService;
        this.bookOrderService = bookOrderService;
    }

    @GetMapping("/{userId}")
    public String getById(@PathVariable int userId, Model model) {
        model.addAttribute("userModel", userService.findById(userId));
        return "user/user";
    }

    @GetMapping("/all")
    public String showAllUsers(Model model) {
        List<UserDTO> user = userService.findAll();
        model.addAttribute("userModel", user);
        return "user/allUsers";
    }

    @GetMapping("/lending")
    public String giveBook(Model model) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("lendingModel", new BookOrderDTO());
        return "user/lendingBook";
    }

    @PostMapping("/lending")
    public String giveBookToUser(@ModelAttribute("lendingModel") BookOrderDTO bookOrderDTO) {
        bookOrderService.create(bookOrderDTO);
        bookService.deleteOneCopy(bookOrderDTO.getBook().getId());
        return "redirect:/user";
    }

    @GetMapping("/return")
    public String returnBook(Model model) {
        model.addAttribute("orderId", bookOrderService.findAll());
        model.addAttribute("bookId", bookService.findAll());
        model.addAttribute("returningBook", new BookOrderDTO());
        return "user/returningBook";
    }

    @PostMapping("/user/return")
    public String returningBook(@ModelAttribute("returningBook") BookOrderDTO bookOrderDTO) {
        bookService.addOneCopy(bookOrderDTO.getBook().getId());
        bookOrderService.returnBook(bookOrderDTO);
        return "redirect:/user";
    }

    @GetMapping("/statistic")
    public String statistic() {
        return "user/statistic";
    }

    @GetMapping("/statistic/average")
    public String averageAge(Model model) {
        model.addAttribute("averageAgeModel", userService.avgUserAge());
        return "statistic/averageAge";
    }

}
