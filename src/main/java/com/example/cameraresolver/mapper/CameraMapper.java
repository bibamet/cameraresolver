package com.example.cameraresolver.mapper;

import com.example.cameraresolver.dto.CameraDto;
import com.example.cameraresolver.entity.CameraEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CameraMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "timestamp", expression = "java(new java.sql.Timestamp(cameraDto.getTimestamp()).toLocalDateTime())")
    CameraEntity toCameraEntity(CameraDto cameraDto);

}
