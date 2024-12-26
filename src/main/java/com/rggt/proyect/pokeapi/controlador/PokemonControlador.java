package com.rggt.proyect.pokeapi.controlador;


import com.rggt.proyect.pokeapi.servicio.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonControlador {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("titulo","PokeApi");
        model.addAttribute("lista",pokemonService.getPokemons());
        return "index";
    }
}
