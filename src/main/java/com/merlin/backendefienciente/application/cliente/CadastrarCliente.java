package com.merlin.backendefienciente.application.cliente;

import com.merlin.backendefienciente.domain.cliente.Cliente;
import com.merlin.backendefienciente.domain.cliente.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarCliente {
    private final ClienteRepository clienteRepository;

    public CadastrarCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar(Cliente cliente){
        return clienteRepository.salvar(cliente);
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }
}
