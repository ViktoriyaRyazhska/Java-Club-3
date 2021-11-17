package com.web.club3.controller;

import com.web.club3.dto.BookOrderDTO;
import com.web.club3.model.BookOrder;
import com.web.club3.service.impl.BookOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class BookOrderController {

    private final BookOrderServiceImpl bookOrderService;

    @Autowired
    public BookOrderController(BookOrderServiceImpl bookOrderService) {
        this.bookOrderService = bookOrderService;
    }

    @GetMapping("/{orderId}")
    public String getById(@PathVariable int orderId, Model model) {
        model.addAttribute("orderModel", bookOrderService.findById(orderId));
        return "order/order";
    }

    @GetMapping("/all")
    public String showAllOrders(Model model) {
        List<BookOrderDTO> bookOrder = bookOrderService.findAll();
        model.addAttribute("orderModel", bookOrder);
        return "order/allOrders";
    }
}
