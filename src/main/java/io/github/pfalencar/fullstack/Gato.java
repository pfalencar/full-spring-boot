package io.github.pfalencar.fullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)  //significa que essa annotation Development só pode ser inserida em uma classe
@Retention(RetentionPolicy.RUNTIME)
@Autowired
@Qualifier("gato")
public @interface Gato {
}
