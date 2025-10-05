package mx.com.chicatanas.infrastructure.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignGoogleConfig {

    @Value("${googlemaps.api.key}")
    private String apiKey;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return (RequestTemplate template) -> {
            template.query("key", apiKey);
        };
    }
}

