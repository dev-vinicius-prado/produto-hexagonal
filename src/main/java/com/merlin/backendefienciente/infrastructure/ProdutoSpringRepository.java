package com.merlin.backendefienciente.infrastructure;

import com.merlin.backendefienciente.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSpringRepository extends JpaRepository<Produto, Long> {
}
