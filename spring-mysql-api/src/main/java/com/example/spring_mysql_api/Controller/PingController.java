package com.example.spring_mysql_api.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PingController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
            public String sayHello() {
        return "Hello, I am alive!";
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @PostMapping("/ping")
    public String pingWithParams(@RequestParam String message, @RequestParam(required = false) String name){
        return "Recieved: " + message + (name != null ? " from " + name : "");
//                String.format("Received the following message: %s", message);
    }






}
