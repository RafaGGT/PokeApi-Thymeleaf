package com.rggt.proyect.pokeapi.modelos.dto;

import java.util.List;
import java.util.stream.Collectors;

public class Pokemon {

    private Integer id;
    private String name;
    private Integer base_experience;
    private List<Ability> abilities;
    private List<Type> types;
    private Sprites sprites;

    public Pokemon(Integer id, String name, Integer base_experience, List<Ability> abilities, List<Type> types, Sprites sprites) {
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.abilities = abilities;
        this.types = types;
        this.sprites = sprites;
    }

    public Pokemon() {
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
    //Encargado de obtener los nombres de las habilidades del Pokémon separados por " | "
    public String getAbilitiesNames() {
        return abilities.stream()
                .map(a -> a.getAbility().getName()) // Extrae el nombre de cada habilidad.
                .collect(Collectors.joining(" | ")); // Junta los nombres con " | ".
    }

    //Obtiene los nombres de los tipos del Pokémon separados por " | "
    public String getTypesNames() {
        return types.stream()
                .map(t -> t.getType().getName()) // Extrae el nombre de cada tipo.
                .collect(Collectors.joining(" | ")); // Junta los nombres con " | ".
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Pokemon ID: ").append(id).append("\n") // Añade el ID del Pokémon.
                .append("Nombre: ").append(name).append("\n") // Añade el nombre.
                .append("Experiencia Base: ").append(base_experience).append("\n") // Añade la experiencia base.
                .append("Habilidades: ").append(getAbilitiesNames()).append("\n") // Añade las habilidades.
                .append("Tipo: ").append(getTypesNames()).append("\n") // Añade los tipos.
                .toString(); // Devuelve el resultado final como cadena.
    }
}