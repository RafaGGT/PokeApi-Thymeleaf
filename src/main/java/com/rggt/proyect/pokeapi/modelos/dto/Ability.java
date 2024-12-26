package com.rggt.proyect.pokeapi.modelos.dto;


public class Ability {

    private AbilityDetails ability;

    public Ability(AbilityDetails ability) {
        this.ability = ability;
    }

    public Ability() {
    }

    public AbilityDetails getAbility() {
        return ability;
    }

    public void setAbility(AbilityDetails ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "ability=" + ability +
                '}';
    }
}