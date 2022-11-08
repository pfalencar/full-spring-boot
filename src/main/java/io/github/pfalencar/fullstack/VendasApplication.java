package io.github.pfalencar.fullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan (
        basePackages = {
        "com.umaoutabiblioteca.projeto"}
        )
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName; //o Spring vai na calsse application.properties e pega o valor da application.name e coloca nesta variável.

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
