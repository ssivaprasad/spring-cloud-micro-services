package com.ssp.apps.bankapp.customers.apiclient.config.logging;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
final class FeignRequest {
    private String method;
    private String url;
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
        return String.format("Method = %s, url = %s, Headers = %s Body = %s, BodyLength = %s Bytes",
                method, url, headers, body, (body != null && body.trim().length() > 0 ? body.length() : 0));
    }
}
