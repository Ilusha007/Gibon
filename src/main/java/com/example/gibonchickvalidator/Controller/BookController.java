package com.example.gibonchickvalidator.Controller;


import com.example.gibonchickvalidator.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    public final BookService bookService;

    @GetMapping("")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/Exchange")
    public String exchage(Model model){
        model.addAttribute("books",bookService.findAll());
        return "bookExchange";
    }

}
