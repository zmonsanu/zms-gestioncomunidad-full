package com.zms.gestioncomunidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.zms.gestioncomunidad")
@EntityScan("com.zms.gestioncomunidad.model")
@EnableJpaRepositories("com.zms.gestioncomunidad.repository")
public class GestionComunidadApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionComunidadApplication.class, args);
    }
}
