package org.example.controllers;

import org.example.models.dto.UserDTO;
import org.example.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;
    public UserController (UserService userService){
        this.userService = userService;
    }

    @PostMapping("/api/weather")
    public ResponseEntity<UserDTO> createWeather(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.createWeather(userDTO));
    }

}
