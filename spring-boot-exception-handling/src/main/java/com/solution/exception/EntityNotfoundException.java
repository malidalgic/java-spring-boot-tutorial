package com.solution.exception;

public class EntityNotfoundException extends RuntimeException {
    public EntityNotfoundException(String param) {
        super(param);
    }
}