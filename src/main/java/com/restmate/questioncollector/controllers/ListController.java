package com.restmate.questioncollector.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/list")
@Controller
public class ListController {

    @RequestMapping({"","/","index","index.html"})
public String index(){

    return "list/index";
}
}
