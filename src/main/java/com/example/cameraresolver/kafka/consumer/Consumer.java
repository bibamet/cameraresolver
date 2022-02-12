package com.example.cameraresolver.kafka.consumer;

import com.example.cameraresolver.dto.CameraDto;
import com.example.cameraresolver.service.CameraResolverService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableKafka
@RequiredArgsConstructor
public class Consumer {
    private final CameraResolverService cameraResolverService;

    @KafkaListener(topics = "${kafka.topic-name}", containerFactory = "kafkaListenerContainerFactory", groupId = "test-consumer-group")
    public void listenTopic(@Payload ConsumerRecord<String, String> consumerRecord) {
        log.info("Message commited - {}", consumerRecord.value());
        Gson gson = new Gson();
        CameraDto cameraDto = gson.fromJson(consumerRecord.value(), CameraDto.class);
        cameraResolverService.resolveCameraEvent(cameraDto);
        log.info("Final data: {}", cameraDto);
    }

}
