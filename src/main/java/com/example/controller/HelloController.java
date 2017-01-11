package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tom on 12/21/16.
 */
@Controller
public class HelloController {

    @RequestMapping(path = {"/"})
    public String no_auth() {
        return "index";
    }

    @RequestMapping(path = {"/auth"})
    public String auth() {
        return "auth";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
