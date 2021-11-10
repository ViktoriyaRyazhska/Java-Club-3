package org.softserve.javaclub.team3.library.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    @GetMapping(value = "/")
    public String homePage() {
        return "index";
    }
}
