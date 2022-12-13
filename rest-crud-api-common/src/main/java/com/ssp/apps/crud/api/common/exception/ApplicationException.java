package com.ssp.apps.crud.api.common.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException{

    private String errorCode;

    public ApplicationException(String errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode = errorCode;
    }
}
