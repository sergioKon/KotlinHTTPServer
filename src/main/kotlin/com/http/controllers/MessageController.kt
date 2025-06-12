package com.http.controllers

import org.springframework.web.bind.annotation.*


@RestController
class MessageController {
    @GetMapping("/hello")
    fun sayHello() : String{
        return "Hello, World!"
    }
  //  fun index(@RequestParam("name") name: String) = "Hello, $name!"
}