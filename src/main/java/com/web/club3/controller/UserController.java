package com.web.club3.controller;

import com.web.club3.model.BookOrder;
import com.web.club3.model.User;
import com.web.club3.service.impl.BookOrderServiceImpl;
import com.web.club3.service.impl.BookServiceImpl;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        List<User> user = userService.findAll();
        model.addAttribute("userModel", user);
        return "user/allUsers";
    }

    @GetMapping("/lending")
    public String giveBook(Model model) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("lendingModel", new BookOrder());
        return "user/lendingBook";
    }

    @PostMapping("/lending")
    public String giveBookToUser(@ModelAttribute("lendingModel") @RequestParam("bookId") int bookId,
                                 @RequestParam("userId") int userId,
                                 @Valid BookOrder bookOrder) {
        bookOrderService.lendBook(userId, bookId, bookOrder);
        return "redirect:/user";
    }

    @GetMapping("/returning")
    public String returnBook(Model model) {
        model.addAttribute("users", new UserDto());
        model.addAttribute("orders", new BookOrderDto());
        model.addAttribute("returningModel", new BookOrderDto());
        return "/user/returningBook";
    }

    @PostMapping("/returning")
    public String returnLentBook(@ModelAttribute("returningBook") @RequestParam("bookId") int bookId,
                                 @RequestParam("userId") int userId,
                                 @Valid BookOrderDto bookOrderDto) {
        bookOrderService.lendBook(bookService.findById(bookId).getId(), userService.findById(userId).getId(), bookOrderDto);

        bookOrderService.returnBook(bookId,userId);
        return "redirect:/user";
    }
}
