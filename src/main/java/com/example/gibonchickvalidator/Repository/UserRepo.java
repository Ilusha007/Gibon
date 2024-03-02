package com.example.gibonchickvalidator.Repository;

import com.example.gibonchickvalidator.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
