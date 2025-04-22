package AdrresService.Address.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public WebClient webClient(){
        WebClient webClient=WebClient.builder().baseUrl("http://localhost:8085/booking")
                .defaultCookie("cookie-name","cookie-value")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        return  webClient;
    }
}
