package com.photo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index.do")
    public String index(Model model) {

        model.addAttribute("name", "TEST");
        model.addAttribute("account", "TEST2");
        return "index";
    }
}
