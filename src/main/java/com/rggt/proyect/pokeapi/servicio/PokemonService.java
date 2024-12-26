package com.rggt.proyect.pokeapi.servicio;

import com.rggt.proyect.pokeapi.modelos.dao.PokemonDAO;
import com.rggt.proyect.pokeapi.modelos.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonDAO pokemonDAO;

    public List<Pokemon> getPokemons() {
        return pokemonDAO.getPokemons();
    }
}
