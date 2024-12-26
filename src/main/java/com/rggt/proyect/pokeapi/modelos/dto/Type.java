package com.rggt.proyect.pokeapi.modelos.dto;

public class Type {

    private TypeDetails type;

    public Type(TypeDetails type) {
        this.type = type;
    }

    public Type() {
    }

    public TypeDetails getType() {
        return type;
    }

    public void setType(TypeDetails type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type=" + type +
                '}';
    }
}