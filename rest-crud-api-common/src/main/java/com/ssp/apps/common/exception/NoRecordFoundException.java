package com.ssp.apps.common.exception;

public class NoRecordFoundException extends ApplicationException {
    public NoRecordFoundException(String errorMessage) {
        super("NO_DATA_FOUND",errorMessage);
    }
}
