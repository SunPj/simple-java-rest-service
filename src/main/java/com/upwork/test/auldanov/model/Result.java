package com.upwork.test.auldanov.model;

/**
 * Created by kraken on 4/25/16.
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
