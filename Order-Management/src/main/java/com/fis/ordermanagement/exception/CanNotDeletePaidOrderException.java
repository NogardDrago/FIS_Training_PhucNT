package com.fis.ordermanagement.exception;

public class CanNotDeletePaidOrderException extends Exception{
    public CanNotDeletePaidOrderException(String message) {
        super(message);
    }
}
