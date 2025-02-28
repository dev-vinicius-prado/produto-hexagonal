package com.merlin.backendefienciente.application.produto;

import com.merlin.backendefienciente.domain.produto.Produto;
import com.merlin.backendefienciente.domain.produto.ProdutoRepository;
import com.merlin.backendefienciente.infrastructure.produto.ProdutoJpaRepository;
import org.springframework.stereotype.Service;

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
}
