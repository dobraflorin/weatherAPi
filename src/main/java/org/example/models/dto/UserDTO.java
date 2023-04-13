package org.example.models.dto;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;
@Data
public class UserDTO {

    private String location;
    private double temperature;
    private int humidity;

}
