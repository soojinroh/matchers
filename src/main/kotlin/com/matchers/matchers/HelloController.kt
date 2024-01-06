package com.matchers.matchers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
@RestController
class HelloController {

    @GetMapping
    fun index(): String {
        return "Greetings from Spring Boot!"
    }
}