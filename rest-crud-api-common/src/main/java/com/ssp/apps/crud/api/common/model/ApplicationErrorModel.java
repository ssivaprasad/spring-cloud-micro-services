package com.ssp.apps.crud.api.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApplicationErrorModel extends BaseResponseModel {

    private LocalDateTime timestamp;
    private String errorCode;
    private String errorDescription;
    private String errorType;

}
