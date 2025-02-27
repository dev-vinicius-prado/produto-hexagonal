package com.merlin.backendefienciente.domain;

import java.util.List;

public interface ProdutoRepository {
    Produto salvar(Produto produto);

    List<Produto> listarTodos();
}
