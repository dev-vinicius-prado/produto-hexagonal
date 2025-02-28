package com.merlin.backendefienciente.infrastructure.cliente;

import com.merlin.backendefienciente.domain.cliente.Cliente;
import com.merlin.backendefienciente.domain.cliente.ClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteJpaRepository implements ClienteRepository {

    private final ClienteSpringRepository repository;

    public ClienteJpaRepository(ClienteSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}
