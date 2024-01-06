package com.matchers.matchers.rounds.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RoundController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("name", "해보자!")
        return "/hello"
    }

}