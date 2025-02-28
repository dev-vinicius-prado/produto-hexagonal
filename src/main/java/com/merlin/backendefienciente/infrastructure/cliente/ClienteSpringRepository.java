package com.merlin.backendefienciente.infrastructure.cliente;

import com.merlin.backendefienciente.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteSpringRepository extends JpaRepository<Cliente, Long> {
    Cliente findByCpf(String cpf);
}
