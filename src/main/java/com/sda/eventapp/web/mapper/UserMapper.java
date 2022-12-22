package com.sda.eventapp.web.mapper;

import com.sda.eventapp.model.User;
import com.sda.eventapp.web.mvc.form.CreateUserForm;

public class UserMapper {
    public User to(CreateUserForm form) {
        return User.builder()
                .username(form.getUsername())
                .password(form.getPassword())
                .email(form.getEmail())
                .build();
    }
}