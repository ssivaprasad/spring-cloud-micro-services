package com.ssp.apps.crud.api.common.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class RequestValidationException extends RuntimeException {
    private List<String> validationErrors;

    public RequestValidationException(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
