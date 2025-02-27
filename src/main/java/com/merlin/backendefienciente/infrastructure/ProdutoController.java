package com.merlin.backendefienciente.infrastructure;

import com.merlin.backendefienciente.application.CadastrarProduto;
import com.merlin.backendefienciente.domain.Produto;
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
        return cadastrarProduto.getProdutoRepository().listarTodos();
    }
}
