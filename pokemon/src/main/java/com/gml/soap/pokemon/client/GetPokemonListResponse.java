package com.gml.soap.pokemon.client;

import java.util.List;

import com.gml.soap.pokemon.dto.PokemonDto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "getPokemonListResponse")
public class GetPokemonListResponse {

    private List<PokemonDto> pokemon;

    @XmlElement(name = "pokemon")
    public List<PokemonDto> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokemonDto> pokemon) {
        this.pokemon = pokemon;
    }
}
