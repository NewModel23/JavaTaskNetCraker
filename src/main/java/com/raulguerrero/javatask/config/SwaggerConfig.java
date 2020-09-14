package com.raulguerrero.javatask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
   @Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2)
         .select()
         .apis(RequestHandlerSelectors.any())
         .paths(PathSelectors.any())
         .build().apiInfo(apiInfo());    
   }
   
   private ApiInfo apiInfo() {
       return new ApiInfo(
               "Agreement with products info",
               "REST API",
               "service",
               "Terms of service",
               new Contact("Raul Guerrero", "www.linkcode.com.mx", "raul.guerrero@linkcode.com.mx"),
               "License of API", "API license URL", Collections.emptyList());
   }
}