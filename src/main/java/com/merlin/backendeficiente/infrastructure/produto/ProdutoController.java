package com.merlin.backendeficiente.infrastructure.produto;

import com.merlin.backendeficiente.application.produto.CadastrarProduto;
import com.merlin.backendeficiente.domain.produto.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final CadastrarProduto cadastrarProduto;

    public ProdutoController(CadastrarProduto cadastrarProduto) {
        this.cadastrarProduto = cadastrarProduto;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto){
        return cadastrarProduto.executar(produto);
    }

    @GetMapping
    public List<Produto> listar(){
        return cadastrarProduto.listarTodos();
    }
}
