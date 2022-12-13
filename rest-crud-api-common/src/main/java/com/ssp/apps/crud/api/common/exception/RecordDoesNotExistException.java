package com.ssp.apps.crud.api.common.exception;

public class RecordDoesNotExistException extends ApplicationException {
    public RecordDoesNotExistException(String errorMessage) {
        super("RECORD_DOES_NOT_EXIST",errorMessage);
    }
}
