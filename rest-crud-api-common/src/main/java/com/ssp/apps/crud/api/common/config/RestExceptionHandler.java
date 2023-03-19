package com.ssp.apps.crud.api.common.config;


import com.ssp.apps.crud.api.common.exception.*;
import com.ssp.apps.crud.api.common.model.ApplicationErrorModel;
import com.ssp.apps.crud.api.common.model.ValidationErrorModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;

@ControllerAdvice
@Slf4j
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
    public ResponseEntity<ApplicationErrorModel> handleRecordDoesNotExistException(RecordDoesNotExistException ex) {
        return new ResponseEntity<ApplicationErrorModel>(createErrorResponse(ex), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<ApplicationErrorModel> handleIllegalArgumentException(InvalidRequestException ex) {
        return new ResponseEntity<ApplicationErrorModel>(createErrorResponse(ex), HttpStatus.PRECONDITION_FAILED);
    }

    @ExceptionHandler(RequestValidationException.class)
    public ResponseEntity<ValidationErrorModel> handleRuntimeException(RequestValidationException ex) {
        return new ResponseEntity<ValidationErrorModel>(new ValidationErrorModel(ex.getValidationErrors()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApplicationErrorModel> handleRuntimeException(RuntimeException ex) {
        log.error("", ex);
        return new ResponseEntity<ApplicationErrorModel>(createSystemErrorResponse(ex), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ApplicationErrorModel createErrorResponse(ApplicationException exception) {
        ApplicationErrorModel errorDto = ApplicationErrorModel.builder()
                .timestamp(LocalDateTime.now())
                .errorCode(exception.getErrorCode())
                .errorDescription(exception.getMessage())
                .errorType(exception.getClass().getSimpleName())
                .build();
        errorDto.setStatus("error");
        return errorDto;
    }

    private ApplicationErrorModel createSystemErrorResponse(RuntimeException exception) {
        ApplicationErrorModel errorDto = ApplicationErrorModel.builder()
                .timestamp(LocalDateTime.now())
                .errorCode("SYSTEM_ERROR")
                .errorDescription(exception.getMessage())
                .errorType(exception.getClass().getSimpleName())
                .build();
        errorDto.setStatus("error");
        return errorDto;
    }

}
