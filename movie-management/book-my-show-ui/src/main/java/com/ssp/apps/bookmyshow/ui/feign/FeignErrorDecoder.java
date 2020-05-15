package com.ssp.apps.bookmyshow.ui.feign;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        log.info("=== >>>> Feign Exception Occured while Calling : " + methodKey);
        return new ResponseStatusException(HttpStatus.valueOf(response.status()),
                "Error Occured while calling: " + methodKey);
    }

}
