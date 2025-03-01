package com.merlin.backendeficiente.application.cliente;

import com.merlin.backendeficiente.domain.cliente.Cliente;
import com.merlin.backendeficiente.domain.cliente.ClienteRepository;
import com.merlin.backendeficiente.domain.exceptions.ClienteNaoEncontradoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

class ClienteServiceTest {
    @Mock
    private ClienteRepository repository;
    @InjectMocks
    private CadastrarCliente service;

    @BeforeEach
    void setup() {
        System.out.println("🔥 Ritual de Mocks Inicializado...");
    }

    @Test
    void deveBuscarClientePorCpf() {
        String cpf = "12345678900";
        var vinnas = new Cliente(1L, "Vinnas", cpf, BigDecimal.TEN);
        when(repository.buscarPorCpf(cpf)).thenReturn(vinnas);
        Cliente resultado = service.buscarPorCpf(cpf);

        assertNotNull(resultado);
        assertEquals(cpf, resultado.getCpf());
        verify(repository).buscarPorCpf(cpf);
    }
    @Test
    void deveLancarExceptionQuandoBuscarClientePorCpfNaoTiverResultado() {
        String cpf = "12345678900";
        when(repository.buscarPorCpf(cpf)).thenReturn(null);
        var registroNaoEncontradoException = assertThrows(ClienteNaoEncontradoException.class, () -> {
            service.buscarPorCpf(cpf);
        });

        String mensagemEsperada = "Cliente não encontrado!";
        String mensagemRecebida = registroNaoEncontradoException.getMessage();
        assertTrue(mensagemRecebida.equals(mensagemEsperada));
        verify(repository).buscarPorCpf(cpf);
    }

}