package com.zms.gestioncomunidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan("com.zms.gestioncomunidad")
@EntityScan("com.zms.gestioncomunidad.model")
@EnableJpaRepositories("com.zms.gestioncomunidad.repository")
public class GestionComunidadApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionComunidadApplication.class, args);
    }

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200");
            }
        };
        
        
    }
}
