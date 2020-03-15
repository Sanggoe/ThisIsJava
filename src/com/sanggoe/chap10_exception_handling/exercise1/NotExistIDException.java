package com.sanggoe.chap10_exception_handling.exercise1;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
