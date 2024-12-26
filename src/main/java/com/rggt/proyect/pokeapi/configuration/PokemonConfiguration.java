package com.rggt.proyect.pokeapi.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PokemonConfiguration {

    @Bean //Permite solicitudes HTTP
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
