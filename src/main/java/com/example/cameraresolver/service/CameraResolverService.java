package com.example.cameraresolver.service;

import com.example.cameraresolver.data.CameraRepo;
import com.example.cameraresolver.dto.CameraDto;
import com.example.cameraresolver.logic.AbstractResolverLogic;
import com.example.cameraresolver.logic.SpeedLimit;
import com.example.cameraresolver.mapper.CameraMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CameraResolverService {

    private final CameraMapper cameraMapper;
    private final CameraRepo cameraRepo;
    private final AbstractResolverLogic resolverLogic;
    private final SpeedLimit speedLimit;

    public void resolveCameraEvent(CameraDto cameraDto) {
        resolverLogic.resolveEvent(cameraDto, speedLimit);
        cameraRepo.save(cameraMapper.toCameraEntity(cameraDto));
    }

    public long getSpeedLimit() {
        return speedLimit.getSpeedLimit();
    }

    public void setSpeedLimit(long speed) {
        speedLimit.setSpeedLimit(speed);
    }

    public List<CameraDto> getLastEvents(Long val) {
        val = val == null ? 10 : val;
        return cameraMapper.toCameraDtoList(cameraRepo.getLastEvents(val));
    }

}
