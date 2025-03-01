package com.merlin.backendeficiente.application;

import com.merlin.backendeficiente.domain.exceptions.ClienteNaoEncontradoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestControlAdviceExceptionHandler {

    private static final Logger log = LogManager.getLogger(RestControlAdviceExceptionHandler.class);

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String clienteNaoEncontradoException(ClienteNaoEncontradoException ex, WebRequest request){
        String clienteNaoEncontrado = "Cliente não encontrado!";
        log.error(clienteNaoEncontrado, ex);
        return clienteNaoEncontrado;
    }
}
