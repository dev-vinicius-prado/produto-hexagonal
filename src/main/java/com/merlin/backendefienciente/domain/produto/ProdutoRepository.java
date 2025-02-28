package com.merlin.backendefienciente.domain.produto;

import java.util.List;

public interface ProdutoRepository {
    Produto salvar(Produto produto);

    List<Produto> listarTodos();
}
