package com.rggt.proyect.pokeapi.modelos.dao;

import com.rggt.proyect.pokeapi.modelos.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

// Marca esta clase como un repositorio (DAO) para acceder a datos de la PokeAPI
@Repository
public class PokemonDAO {

    // Inyección automática del bean RestTemplate para realizar solicitudes HTTP
    @Autowired
    private RestTemplate restTemplate;

    // URL base de la PokeAPI para obtener información sobre los Pokémon
    private final String apiUrlBase = "https://pokeapi.co/api/v2/pokemon/";

    // Metodo para obtener una lista de los primeros 12 Pokémon desde la API.
    public List<Pokemon> getPokemons(){

        // Inicializa una lista para almacenar los Pokémon
        List<Pokemon> listPokemons = new ArrayList<>();

        // Itera del 1 al 12 para obtener los Pokémon con esas IDs
        for(int i = 1; i <= 12; i++){

            // Construye la URL específica para cada Pokémon
            String urlApi = apiUrlBase + i;

            // Realiza una solicitud GET a la API para obtener un Pokémon
            ResponseEntity<Pokemon> response = restTemplate.exchange(
                    urlApi,             // URL específica del Pokémon
                    HttpMethod.GET,     // Tipo de solicitud: GET
                    null,               // Sin cuerpo o encabezados adicionales
                    Pokemon.class       // Tipo de respuesta esperado: Clase Pokemon
            );
            // Agrega el Pokémon obtenido a la lista
            listPokemons.add(response.getBody());
        }

        // Devuelve la lista de Pokémon
        return listPokemons;
    }
}

