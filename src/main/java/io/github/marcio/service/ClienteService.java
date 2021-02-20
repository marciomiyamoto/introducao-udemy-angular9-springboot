package io.github.marcio.service;

import io.github.marcio.model.Cliente;
import io.github.marcio.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClientesRepository repository;

    public ClienteService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
    }

}
