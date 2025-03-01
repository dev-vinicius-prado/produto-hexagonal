package com.merlin.backendeficiente.domain.produto;

import java.util.List;

public interface ProdutoRepository {
    Produto salvar(Produto produto);

    List<Produto> listarTodos();
}
