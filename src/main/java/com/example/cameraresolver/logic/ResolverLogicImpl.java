package com.example.cameraresolver.logic;

import com.example.cameraresolver.dto.CameraDto;
import com.example.cameraresolver.enums.PriorityClass;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ResolverLogicImpl implements AbstractResolverLogic {

    public void resolveEvent(CameraDto cameraDto, SpeedLimit speedLimit) {

        cameraDto.setCurrentLimit(speedLimit.getSpeedLimit());
        if (cameraDto.getPriorityClass().compareTo(PriorityClass.SPECIAL_SERVICES) == 0) {
            cameraDto.setGuilty(false);
            return;
        }
        if (cameraDto.getSpeed() > speedLimit.getSpeedLimit()) {
            cameraDto.setGuilty(true);
            return;
        }
        cameraDto.setGuilty(false);
    }
}
