package com.example.cameraresolver.data;

import com.example.cameraresolver.entity.CameraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CameraRepo extends JpaRepository<CameraEntity, UUID> {
}
