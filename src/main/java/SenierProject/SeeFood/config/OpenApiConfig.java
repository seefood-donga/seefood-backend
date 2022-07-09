package SenierProject.SeeFood.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        final Info info = new Info()
                .version(LocalDateTime.now().toString())
                .title("씨푸드")
                .description("");

        return new OpenAPI()
                .addServersItem(new Server().url("http://13.209.32.216:8080"))
                .addServersItem(new Server().url("http://localhost:8080/"))
                .components(new Components())
                .info(info);
    }
}