package com.lysachenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String getStartPage(){
        return "/index.html";
    }

    @RequestMapping("notebook")
    public String getNotebookFrom(){
        return "/notebookForm.html";
    }
}
