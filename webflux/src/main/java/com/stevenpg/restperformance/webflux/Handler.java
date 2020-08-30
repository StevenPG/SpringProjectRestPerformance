package com.stevenpg.restperformance.webflux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.IOError;

@Slf4j
@Component
public class Handler {

    private final Service service;

    public Handler(Service service) {
        this.service = service;
    }

    public Mono<ServerResponse> goodEndpoint(ServerRequest r) {
        return ServerResponse.ok().build();
    }

    public Mono<ServerResponse> badEndpoint(ServerRequest r) {
        var result = service.badEndpoint();
        result.onErrorResume()
        return ServerResponse
                .ok()
                .body(result, String.class);
    }
}
