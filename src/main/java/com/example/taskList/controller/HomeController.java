package com.example.taskList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        // Retorna o nome do arquivo HTML dentro de templates (sem .html)
        return "index";
    }
}
