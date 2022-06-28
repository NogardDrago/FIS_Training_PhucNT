package com.fis.ordermanagement.exception;

public class CanOnlyChangeCreatedOrderException extends Exception{
    public CanOnlyChangeCreatedOrderException(String message) {
        super(message);
    }
}
