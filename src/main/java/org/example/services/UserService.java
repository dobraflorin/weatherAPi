package org.example.services;

import org.example.models.dto.UserDTO;

public interface UserService {

    UserDTO createWeather(UserDTO userDTO);
    UserDTO updateWeather(UserDTO userDTO);

}
