package io.github.pfalencar.fullstack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName; //o Spring vai na classe application.properties e pega o valor da application.name e coloca nesta variável.

    @Cachorro
    private Animal animal;

    @Bean(name = "animalExecutar")
    public CommandLineRunner executar() {
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
