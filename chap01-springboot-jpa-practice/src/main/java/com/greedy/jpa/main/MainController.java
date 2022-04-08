package com.greedy.jpa.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/main"})
    public String goToMain() { return "main/main"; }

    @PostMapping(value = "/")
    public String redirectMain() { return "redirect:/main"; }
}
