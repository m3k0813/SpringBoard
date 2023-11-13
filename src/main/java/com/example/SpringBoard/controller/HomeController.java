package com.example.SpringBoard.controller;

import com.example.SpringBoard.domain.User;
import com.example.SpringBoard.service.userService;
import com.example.SpringBoard.domain.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final userService userService;

    public HomeController(com.example.SpringBoard.service.userService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String Home() {
        return "index";
    }

    @RequestMapping("/user/createuser")
    public String createUser() {
        return "/user/createuser";
    }

    @PostMapping("/user/createuser")
    public String createUser(@ModelAttribute UserForm form) {
        User user = new User();
        user.setUid(form.getUid());
        user.setPassword(form.getPassword());
        user.setNickname(form.getNickname());
        System.out.println("member = " + user.getUid());
        System.out.println("member = " + user.getPassword());
        System.out.println("member = " + user.getNickname());
        userService.join(user);
        return "redirect:/";
    }

}
