package br.com.sartori.customers.application.core;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException (String message) {
        super(message);
    }
}
