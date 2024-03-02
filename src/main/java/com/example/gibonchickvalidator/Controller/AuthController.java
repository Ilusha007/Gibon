package com.example.gibonchickvalidator.Controller;


import com.example.gibonchickvalidator.Dto.UserDto;
import com.example.gibonchickvalidator.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class AuthController {


    private final UserService userService;


    @GetMapping
    public String registerForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(UserDto userDto){
        userService.registration(userDto);
        return "redirect:/login";
    }

//    @GetMapping("/login")
//    String login(){
//        return "login";
//    }




}
