package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping()
    public String postUser(@Valid User user, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "user-form";
        }
        model.addAttribute("user", userService.add(user));
        return "user-saved";
    }

}
