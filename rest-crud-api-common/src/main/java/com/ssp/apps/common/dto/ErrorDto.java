package com.ssp.apps.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ErrorDto extends BaseResponseDto {

    private LocalDateTime timestamp;
    private String errorCode;
    private String errorDescription;
    private String errorType;

}
