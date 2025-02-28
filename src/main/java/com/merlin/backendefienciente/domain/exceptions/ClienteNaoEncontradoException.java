package com.merlin.backendefienciente.domain.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ClienteNaoEncontradoException extends RuntimeException{
    public ClienteNaoEncontradoException(String message) {
        super(message);
    }
}
