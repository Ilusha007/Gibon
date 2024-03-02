package com.example.gibonchickvalidator.Service;


import com.example.gibonchickvalidator.Dto.UserDto;

import com.example.gibonchickvalidator.Model.Role;
import com.example.gibonchickvalidator.Model.User;
import com.example.gibonchickvalidator.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {


    public final UserRepo userRepo;

    public final PasswordEncoder passwordEncoder;

    public void registration(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setLogin(userDto.getLogin());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEmail(userDto.getEmail());
        user.setRoles(Collections.singleton(Role.USER));
        user.setPhoneNumber(userDto.getPhoneNumber());
        userRepo.save(user);
    }

}
