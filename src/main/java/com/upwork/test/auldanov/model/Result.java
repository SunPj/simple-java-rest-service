package com.upwork.test.auldanov.model;

/**
 * DTO for REST model
 */
public class Result<T> {
    private final T result;

    public Result(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }
}
