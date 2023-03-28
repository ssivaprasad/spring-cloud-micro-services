package com.ssp.apps.feign.api.client.logging;

import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Setter
public class FeignResponse {
    private int status;
    private String reason;
    private long timeTaken;
    private List<String> headers;
    private String body;

    public void addHeader(String key, String value) {
        if (headers == null) {
            headers = new ArrayList<>();
        }
        headers.add(String.format("%s: %s", key, value));
    }

    @Override
    public String toString() {
        return String.format("Status = %s, Reason = %s, TimeTaken = %s, Headers = %s Body = %s, BodyLength = %s Bytes",
                status, reason, timeTaken, headers, body, (body != null && body.trim().length() > 0 ? body.length() : 0));
    }
}
