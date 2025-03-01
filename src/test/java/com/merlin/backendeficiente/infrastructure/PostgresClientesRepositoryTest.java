package com.merlin.backendeficiente.infrastructure;

import com.merlin.backendeficiente.domain.cliente.Cliente;
import com.merlin.backendeficiente.domain.cliente.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@Testcontainers
@SpringBootTest
class PostgresBookRepositoryAdapterTest {

    @Autowired
    private ClienteRepository clienteRepository; // Usa a interface da application layer

    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine");

    @Test
    void should_persist_and_retrieve_book() {
        Cliente vinnas = new Cliente(1L, "Vinnas", "33333333333", BigDecimal.TEN);
        clienteRepository.salvar(vinnas);

        var retrieved = clienteRepository.buscarPorCpf(vinnas.getCpf());
        assertThat(retrieved).isEqualTo(vinnas);
    }
}