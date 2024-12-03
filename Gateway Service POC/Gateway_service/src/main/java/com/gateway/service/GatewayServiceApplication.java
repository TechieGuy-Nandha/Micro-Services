package com.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(r -> r.path("/Students-Information/**")
                        .filters(f -> f.stripPrefix(1)
								.retry(config -> config.setRetries(3).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR))
						.circuitBreaker(c -> c.setName("staffServiceCB")
								.setFallbackUri("forward:/fallback")))
                        .uri("lb://Students-Information"))
                .build();
// circuit breaker used for when other service is down
// retry mechanism = it will check service many times even though once it is failed
    }
}

