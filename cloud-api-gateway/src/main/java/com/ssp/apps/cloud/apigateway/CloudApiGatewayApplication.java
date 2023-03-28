package com.ssp.apps.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/bank/customers-api/**")
                        .filters(f -> f.rewritePath("/bank/customers-api/(?<segment>.*)","/${segment}"))
                        .uri("lb://bank-customers-management-api")).
                route(p -> p
                        .path("/bank/customer/accounts-api/**")
                        .filters(f -> f.rewritePath("/bank/customer/accounts-api/(?<segment>.*)","/${segment}"))
                        .uri("lb://bank-customer-accounts-management-api")).
                route(p -> p
                        .path("/bank/customer/cards-api/**")
                        .filters(f -> f.rewritePath("/bank/customer/cards-api/(?<segment>.*)","/${segment}"))
                        .uri("lb://bank-customer-cards-management-api")).build();
    }
}
