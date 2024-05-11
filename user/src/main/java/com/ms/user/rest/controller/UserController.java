package com.ms.user.rest.controller;

import com.ms.user.dto.UserRecordDTO;
import com.ms.user.model.UserModel;
import com.ms.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDTO userRecordDTO) {
        UserModel user = new UserModel();
        BeanUtils.copyProperties(userRecordDTO, user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }




}
