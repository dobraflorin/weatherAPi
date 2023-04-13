package org.example.services;

import org.example.models.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplements implements UserService {

    List<UserDTO> weatherList = new ArrayList<>();

    @Override
    public UserDTO createWeather(UserDTO userDTO) {
        weatherList.add(userDTO);
        return userDTO;
    }

    @Override
    public UserDTO updateWeather(UserDTO userDTO) {
        return null;
    }
}
