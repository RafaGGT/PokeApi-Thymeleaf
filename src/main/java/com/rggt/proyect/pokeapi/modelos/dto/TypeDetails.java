package com.rggt.proyect.pokeapi.modelos.dto;

public class TypeDetails {

    private String name;

    public TypeDetails(String name) {
        this.name = name;
    }

    public TypeDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}