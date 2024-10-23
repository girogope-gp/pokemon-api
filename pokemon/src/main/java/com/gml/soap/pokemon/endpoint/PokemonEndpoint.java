package com.gml.soap.pokemon.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gml.soap.pokemon.client.GetPokemonListRequest;
import com.gml.soap.pokemon.client.GetPokemonListResponse;
import com.gml.soap.pokemon.dto.PokemonDto;
import com.gml.soap.pokemon.service.PokemonService;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/pokemon";


    @Autowired
    private PokemonService pokemonService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonListRequest")
    @ResponsePayload
    public GetPokemonListResponse getPokemonList(@RequestPayload GetPokemonListRequest request) {
        List<PokemonDto> pokemonList = pokemonService.getPokemonList(request.getPage(), request.getPageSize());
        GetPokemonListResponse response = new GetPokemonListResponse();
        response.getPokemon().addAll(pokemonList);
        return response;
    }
}
