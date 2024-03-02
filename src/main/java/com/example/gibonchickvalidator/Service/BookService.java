package com.example.gibonchickvalidator.Service;


import com.example.gibonchickvalidator.Model.Book;
import com.example.gibonchickvalidator.Repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BookService {

    private final BookRepo bookRepo;

    public List<Book>findAll(){
       return bookRepo.findAll();
    }



}
