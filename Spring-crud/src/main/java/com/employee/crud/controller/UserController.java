package com.employee.crud.controller;

import com.employee.crud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
//ToDo:在上一行代码("")中填写合适的RestfulApi
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getAllUser")
    //ToDo:在上一行代码("")中填写合适的RestfulApi
    public ResponseEntity getAllUser() {
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }

}
