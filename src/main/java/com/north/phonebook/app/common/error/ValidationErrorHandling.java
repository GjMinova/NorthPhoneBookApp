package com.north.phonebook.app.common.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ValidationErrorHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorResponse>> methodArgumentNotValid(final MethodArgumentNotValidException e) {

        final List<ErrorResponse> errors = new ArrayList<>();
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            errors.add(new ErrorResponse(Error.INVALID_PAYLOAD_VALIDATION.getErrorCode(), fieldError.getField()));
        }
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
