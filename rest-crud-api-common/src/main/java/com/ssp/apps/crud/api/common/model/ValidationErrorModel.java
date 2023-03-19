package com.ssp.apps.crud.api.common.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ValidationErrorModel extends BaseResponseModel {
    private List<String> validationErrors;

    public ValidationErrorModel(List<String> validationErrors) {
        super("error");
        this.validationErrors = validationErrors;
    }
}
