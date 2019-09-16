package com.community.suzn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

   /* @GetMapping("/")
    public static String index(@RequestParam(name="name")String name,Model model){
        model.addAttribute("name",name);
        return "index";
    }*/
}
