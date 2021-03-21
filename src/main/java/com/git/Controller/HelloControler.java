package com.git.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @RequestMapping("index")
    public String index(){
        return "hello github";
    }
}
