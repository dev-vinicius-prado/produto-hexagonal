package com.merlin.backendeficiente.application.produto;

import com.merlin.backendeficiente.domain.produto.Produto;
import com.merlin.backendeficiente.domain.produto.ProdutoRepository;
import com.merlin.backendeficiente.infrastructure.produto.ProdutoJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastrarProduto {
    private final ProdutoJpaRepository produtoRepository;

    public CadastrarProduto(ProdutoJpaRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto executar(Produto produto) {
        return produtoRepository.salvar(produto);
    }

    public ProdutoRepository getProdutoRepository() {
        return produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.listarTodos();
    }
}
