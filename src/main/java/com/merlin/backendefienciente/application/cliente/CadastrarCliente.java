package com.merlin.backendefienciente.application.cliente;

import com.merlin.backendefienciente.domain.cliente.Cliente;
import com.merlin.backendefienciente.domain.cliente.ClienteRepository;
import com.merlin.backendefienciente.domain.exceptions.ClienteNaoEncontradoException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastrarCliente {
    private final ClienteRepository clienteRepository;

    public CadastrarCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar(Cliente cliente) {
        return clienteRepository.salvar(cliente);
    }



    public Cliente buscarPorCpf(String cpf) {
        return Optional.ofNullable(clienteRepository.buscarPorCpf(cpf))
                .orElseThrow(() -> new ClienteNaoEncontradoException("Cliente não encontrado!"));
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.listarTodos();
    }
}
