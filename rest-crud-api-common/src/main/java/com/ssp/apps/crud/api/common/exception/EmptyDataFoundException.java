package com.ssp.apps.crud.api.common.exception;

public class EmptyDataFoundException extends ApplicationException {
    public EmptyDataFoundException(String errorMessage) {
        super("EMPTY_DATA_FOUND", errorMessage);
    }
}
