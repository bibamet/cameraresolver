//package com.example.cameraresolver.config;

//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.beans.factory.annotation.Value;

//import java.util.List;

//@Configuration
//public class ConfigurationClass {

//    @Bean
//    public GroupedOpenApi publicUserApi() {
//        return GroupedOpenApi.builder()
//                .group("Camera")
//                .pathsToMatch("/camera/**")
//                .build();
//    }
//
//    @Bean
//    public OpenAPI customOpenApi(@Value("${application-description}") String appDescription,
//                                 @Value("${application-version}") String appVersion) {
//        return new OpenAPI().info(new Info().title("Application API")
//                        .version(appVersion)
//                        .description(appDescription)
//                        .license(new License().name("Apache 2.0")
//                                .url("http://springdoc.org"))
//                        .contact(new Contact().name("Pasha Kalinchuk")
//                                .email("spr1tee1337@gmail.com")))
//                .servers(List.of(new Server().url("http://localhost:8080")
//                                .description("Dev service"),
//                        new Server().url("http://localhost:8082")
//                                .description("Beta service")));
//    }

//}
