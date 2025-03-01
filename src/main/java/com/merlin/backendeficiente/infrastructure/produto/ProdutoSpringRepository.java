package com.merlin.backendeficiente.infrastructure.produto;

import com.merlin.backendeficiente.domain.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProdutoSpringRepository extends JpaRepository<Produto, Long> {
}
