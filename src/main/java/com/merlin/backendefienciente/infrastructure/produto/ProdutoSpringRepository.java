package com.merlin.backendefienciente.infrastructure.produto;

import com.merlin.backendefienciente.domain.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProdutoSpringRepository extends JpaRepository<Produto, Long> {
}
