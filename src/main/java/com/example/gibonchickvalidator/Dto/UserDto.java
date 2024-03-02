package com.example.gibonchickvalidator.Dto;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UserDto {

    private Long id;

    private String login;

    private String password;

    private String username;

    private String phoneNumber;

    private String email;

    private Set<Role> roles;

}
