package jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedWriter;

@Controller
public class HelloController {
    @GetMapping
    public String hello(Model model){
        model.addAttribute("data","hihihi");
        return "hello";
    }
}
