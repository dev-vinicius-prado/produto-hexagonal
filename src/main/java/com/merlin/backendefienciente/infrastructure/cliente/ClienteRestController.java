package com.merlin.backendefienciente.infrastructure.cliente;

import com.merlin.backendefienciente.application.cliente.CadastrarCliente;
import com.merlin.backendefienciente.domain.cliente.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    private final CadastrarCliente cadastrarCliente;

    public ClienteRestController(CadastrarCliente cadastrarCliente) {
        this.cadastrarCliente = cadastrarCliente;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return cadastrarCliente.executar(cliente);
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return cadastrarCliente.listarTodos();
    }

    @GetMapping("/{cpf}")
    public Cliente buscarPorCpf(@PathVariable String cpf) {
        return cadastrarCliente.buscarPorCpf(cpf);
    }

}
