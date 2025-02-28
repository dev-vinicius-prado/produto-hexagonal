package com.merlin.backendefienciente.infrastructure.produto;

import com.merlin.backendefienciente.domain.produto.Produto;
import com.merlin.backendefienciente.domain.produto.ProdutoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoJpaRepository implements ProdutoRepository {

    public ProdutoJpaRepository(ProdutoSpringRepository repository) {
        this.repository = repository;
    }

    private final ProdutoSpringRepository repository;

    @Override
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
