package com.fis.ordermanagement.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessage {
    private LocalDateTime timestamp;
    private String code;
    private String message;

}
