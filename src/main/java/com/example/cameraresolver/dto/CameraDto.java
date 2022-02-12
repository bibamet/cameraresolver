package com.example.cameraresolver.dto;

import com.example.cameraresolver.enums.PriorityClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CameraDto {

    private String address;
    private long speed;
    private String number;
    private long timestamp;
    private PriorityClass priorityClass;
    private long currentLimit;
    private boolean guilty;

}
