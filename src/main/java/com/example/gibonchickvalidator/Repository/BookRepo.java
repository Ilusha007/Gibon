package com.example.gibonchickvalidator.Repository;

import com.example.gibonchickvalidator.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
