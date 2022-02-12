package com.example.cameraresolver.controller;

import com.example.cameraresolver.service.CameraResolverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping("speed")
@RequiredArgsConstructor
@Validated
public class CameraController {

    private final CameraResolverService cameraResolverService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String setSpeedLimit(@RequestParam(name = "val") @Positive long value) {
        cameraResolverService.setSpeedLimit(value);
        return String.format("Successfull. Current speed limit is %d", value);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public long getSpeedLimit() {
        return cameraResolverService.getSpeedLimit();
    }

}
