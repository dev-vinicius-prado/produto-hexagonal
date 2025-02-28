package com.merlin.backendefienciente.application.cliente;

import com.merlin.backendefienciente.domain.cliente.Cliente;
import com.merlin.backendefienciente.domain.cliente.ClienteRepository;
import com.merlin.backendefienciente.infrastructure.cliente.ClienteJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarCliente {
    private final ClienteJpaRepository clienteRepository;

    public CadastrarCliente(ClienteJpaRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar(Cliente cliente){
        return clienteRepository.salvar(cliente);
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }
}
