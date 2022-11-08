package io.github.pfalencar.fullstack;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //TYPE significa que essa annotation Development só pode ser inserida em uma classe
@Retention(RetentionPolicy.RUNTIME)
@Configuration  //Só uma classe que pode ser o @Configuration
@Profile("development")
public @interface Development {
}
