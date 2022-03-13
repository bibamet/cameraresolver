//package com.example.cameraresolver.config;
//
//import lombok.Generated;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import springfox.documentation.swagger.web.InMemorySwaggerResourcesProvider;
//import springfox.documentation.swagger.web.SwaggerResource;
//import springfox.documentation.swagger.web.SwaggerResourcesProvider;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@Generated
//@RequiredArgsConstructor
//public class SwaggerConfig {
//
//    private final ResourcePatternResolver resourceResolver;
//
//
//    /**
//     * Отображение Swagger-UI непосредственно из файлов спецификации OpenAPI,
//     * обслуживаемых Spring, из ресурсов в виде статических файлов
//     *
//     * @param resourcesProvider не используется
//     * @return лист с расположнием файлов OpenApi .json для наших сервисов
//     */
//    @Primary
//    @Bean
//    public SwaggerResourcesProvider swaggerResourcesProvider(InMemorySwaggerResourcesProvider resourcesProvider) {
//        return () -> {
//            List<SwaggerResource> swaggerResources = new ArrayList<>();
//            try {
//                for (Resource resource : resourceResolver.getResources("classpath:openapi/*.json")) {
//                    SwaggerResource swaggerResource = new SwaggerResource();
//                    swaggerResource.setName(resource.getFilename());
//                    swaggerResource.setSwaggerVersion("3.0");
//                    swaggerResource.setUrl("/" + resource.getFilename());
//                    swaggerResources.add(swaggerResource);
//                }
//            } catch (IOException e) {
//                swaggerResources.addAll(resourcesProvider.get());
//            }
//            return swaggerResources;
//        };
//    }
//}
