package com.fis.ordermanagement.exception;

public class CanOnlyAddToCreatedOrderException extends Exception{
    public CanOnlyAddToCreatedOrderException(String message) {
        super(message);
    }
}
