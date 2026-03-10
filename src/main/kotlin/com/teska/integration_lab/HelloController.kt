package com.teska.integration_lab

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/api")
    fun index(): String = "Greetings from Spring Boot!"
}