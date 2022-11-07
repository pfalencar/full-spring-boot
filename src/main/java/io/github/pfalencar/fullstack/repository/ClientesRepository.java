package io.github.pfalencar.fullstack.repository;

import io.github.pfalencar.fullstack.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
        //System.out.println("Persistindo ClientesRepository");
    }
}
