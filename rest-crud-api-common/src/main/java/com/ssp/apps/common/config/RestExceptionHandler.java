package com.ssp.apps.common.config;

import com.ssp.apps.common.dto.ErrorDto;
import com.ssp.apps.common.exception.ApplicationException;
import com.ssp.apps.common.exception.EmptyDataFoundException;
import com.ssp.apps.common.exception.NoRecordFoundException;
import com.ssp.apps.common.exception.RecordDoesNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(NoRecordFoundException.class)
    public ResponseEntity<Object> handleNoRecordFoundException(NoRecordFoundException ex) {
        return new ResponseEntity<Object>(null, HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(EmptyDataFoundException.class)
    public ResponseEntity<Object> handleEmptyDataFoundExceptionn(EmptyDataFoundException ex) {
        return new ResponseEntity<Object>(new ArrayList<>(), HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(RecordDoesNotExistException.class)
    public ResponseEntity<ErrorDto> handleRecordDoesNotExistException(RecordDoesNotExistException ex) {
        return new ResponseEntity<ErrorDto>(createErrorResponse(ex), HttpStatus.NOT_FOUND);
    }

    private ErrorDto createErrorResponse(ApplicationException exception) {
        ErrorDto errorDto = ErrorDto.builder()
                .timestamp(LocalDateTime.now())
                .errorCode(exception.getErrorCode())
                .errorDescription(exception.getMessage())
                .errorType(exception.getClass().getSimpleName())
                .build();
        errorDto.setStatus("error");
        return errorDto;
    }

}
