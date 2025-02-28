package com.merlin.backendefienciente.application.produto;

import com.merlin.backendefienciente.domain.produto.Produto;
import com.merlin.backendefienciente.domain.produto.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarProduto {
    private final ProdutoRepository produtoRepository;

    public CadastrarProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto executar(Produto produto) {
        return produtoRepository.salvar(produto);
    }

    public ProdutoRepository getProdutoRepository() {
        return produtoRepository;
    }
}
