package com.bc48.mstransaction.service;

import com.bc48.mstransaction.entity.Movement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface MovementService {

    public Flux<Movement> getAll();

    public Mono<Movement> getById(String id);

    public Mono<Movement> save(Movement movement);

    public Mono<Movement> update(Movement movement);

    public Mono<Movement> delete(String id);
}