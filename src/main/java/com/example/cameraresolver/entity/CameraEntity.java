package com.example.cameraresolver.entity;

import com.example.cameraresolver.enums.PriorityClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "camera")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CameraEntity {

    @Id
    @GeneratedValue(generator = "generator_uuid")
    @GenericGenerator(name = "generator_uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String address;
    private long speed;
    private String number;
    private LocalDateTime timestamp;
    @Enumerated(EnumType.STRING)
    private PriorityClass priorityClass;
    private long currentLimit;
    private boolean guilty;

}
