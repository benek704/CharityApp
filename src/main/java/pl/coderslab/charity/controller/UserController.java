package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Register")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "register";

    }

    @PostMapping("/Register")
    public String createUser(Model model, @Valid User user, BindingResult result) {
        if (userService.findByUserEmail(user.getEmail()) != null || result.hasErrors()) {
            model.addAttribute("user", new User());
            return "register";
        } else
            userService.saveUser(user);
        return "index";
    }

    @GetMapping("/Login")
    public String loginUser() {
        return "login";
    }

}