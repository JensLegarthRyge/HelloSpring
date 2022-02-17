package com.example.HelloSpring.Controller;

import com.example.HelloSpring.Services.IsItFridayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String index() {
        return "Hello bud";
    }

    @GetMapping("/Echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    @GetMapping("/ErDetFredag.dk")
    public String erDetFredag(){
        return new IsItFridayService().isItFriday();
    }


}
