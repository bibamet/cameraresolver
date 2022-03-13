package com.example.cameraresolver.data;

import com.example.cameraresolver.entity.CameraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CameraRepo extends JpaRepository<CameraEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT * FROM camera as camera order by camera.timestamp desc limit :val ")
    List<CameraEntity> getLastEvents(long val);
}
