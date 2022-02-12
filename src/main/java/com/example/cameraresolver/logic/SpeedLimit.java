package com.example.cameraresolver.logic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SpeedLimit {
    @Value("${internal.camera.speed-limit}")
    private long speedLimit;
}
