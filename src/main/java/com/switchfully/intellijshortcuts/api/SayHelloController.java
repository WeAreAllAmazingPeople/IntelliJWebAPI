package com.switchfully.intellijshortcuts.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class SayHelloController {
    @GetMapping
    String giveACat() {
        return "<img src=\"https://sayingimages.com/wp-content/uploads/cat-spring-meme.jpg\" />";
    }
}
