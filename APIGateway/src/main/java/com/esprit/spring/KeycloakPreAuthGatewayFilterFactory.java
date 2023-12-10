package com.esprit.spring;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class KeycloakPreAuthGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {

    @Override
    public GatewayFilter apply(Object config) {
        // Implement your filter logic here
        return (exchange, chain) -> {
            // Your filter logic
            return chain.filter(exchange);
        };
    }
}