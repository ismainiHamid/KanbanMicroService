package ma.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("profiling-manage", r -> r
                        .path("/api/profiling-manage/**")
                        .uri("http://localhost:6060")
                )
                .route("project-manage", r -> r
                        .path("/api/project-manage/**")
                        .uri("http://localhost:6565")
                )
                .route("kanban-manage", r -> r
                        .path("/api/kanban-manage/**")
                        .uri("http://localhost:7070")
                )
                .build();
    }
}
