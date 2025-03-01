package com.merlin.backendeficiente.domain.cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salvar(Cliente cliente);

    List<Cliente> listarTodos();

    Cliente buscarPorCpf(String cpf);
}
