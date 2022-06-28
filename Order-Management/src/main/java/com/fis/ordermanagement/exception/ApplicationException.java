package com.fis.ordermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.fis.ordermanagement.exception.AppConstant.*;
import java.time.LocalDateTime;

@ControllerAdvice
public class ApplicationException extends ResponseEntityExceptionHandler {
    protected ResponseEntity<ErrorMessage> handlerCustomerNotFoundException(CustomerNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(CUSTOMER_NOT_FOUND)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {OrderNotFoundException.class})
    protected ResponseEntity<ErrorMessage> handlerOrderNotFoundException(OrderNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(ORDER_NOT_FOUND)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {ProductNotFoundException.class})
    protected ResponseEntity<ErrorMessage> handlerProductNotFoundException(ProductNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(PRODUCT_NOT_FOUND)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {OutOfProductException.class})
    protected ResponseEntity<ErrorMessage> handlerOutOfProduct(OutOfProductException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(OUT_OF_PRODUCT)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {CanNotDeletePaidOrderException.class})
    protected ResponseEntity<ErrorMessage> handlerCanNotDeletePaidOrder(
            CanNotDeletePaidOrderException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(CAN_NOT_DELETE_PAID_ORDER)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {CanOnlyChangeCreatedOrderException.class})
    protected ResponseEntity<ErrorMessage> handlerCanOnlyChangeCreatedOrder(
            CanOnlyChangeCreatedOrderException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now())
                        .code(CAN_ONLY_CHANGE_CREATED_ORDER)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(value = {OrderItemNotFoundException.class})
    protected ResponseEntity<ErrorMessage> handlerOrderItemNotFoundException(OrderItemNotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessage.builder().timestamp(LocalDateTime.now()).code(ORDER_ITEM_NOT_FOUND)
                        .message(e.getMessage()).build());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handle(Exception ex,
                                         HttpServletRequest request, HttpServletResponse response) {
        if (ex instanceof NullPointerException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
