package com.restmate.questioncollector.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/submit")
@Controller
public class SubmitController {
    @RequestMapping({"","/","/index","index.html"})
    public String index(){
        return "submit/index";
    }
}
