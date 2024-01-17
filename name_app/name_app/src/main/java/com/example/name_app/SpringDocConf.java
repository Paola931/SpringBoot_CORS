package com.example.name_app;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConf {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(info());
    }
    private Info info(){
        return new Info()
                .title("Name App")
                .description("added Swagger")
                .version("0.0.3")
                ;
    }
}
