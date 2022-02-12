package com.example.cameraresolver.logic;

import com.example.cameraresolver.dto.CameraDto;

public interface AbstractResolverLogic {
    public void resolveEvent(CameraDto cameraDto, SpeedLimit speedLimit);
}
