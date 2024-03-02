package com.example.gibonchickvalidator.Model;


import lombok.Getter;

@Getter
public enum Role {

    ADMIN("Администратор"),
    USER("Пользователь");

    private final String name;

    Role(String name){
        this.name= name;
    }

}
