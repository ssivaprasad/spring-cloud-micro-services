package com.ssp.apps.crud.api.common.exception;

public class InvalidRequestException extends ApplicationException {
    public InvalidRequestException(String errorMessage) {
        super("INVADLID_REQUEST",errorMessage);
    }
}
