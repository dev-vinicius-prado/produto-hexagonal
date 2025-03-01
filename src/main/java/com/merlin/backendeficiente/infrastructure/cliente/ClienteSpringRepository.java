package com.merlin.backendeficiente.infrastructure.cliente;

import com.merlin.backendeficiente.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteSpringRepository extends JpaRepository<Cliente, Long> {
    Cliente findByCpf(String cpf);
}
