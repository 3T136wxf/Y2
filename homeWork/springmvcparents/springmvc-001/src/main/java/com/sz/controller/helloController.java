package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/h")
public class helloController {

    @RequestMapping("/m1")
    public String m1(Model model){
        model.addAttribute("msg","哈哈哈 我终于成功啦！");
        return "suc";

    }
}
