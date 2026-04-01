package io.github.rainbuilt.springboot_learn;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello SpringBoot!";
    }
    
}