package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
}
