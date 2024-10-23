package com.gml.soap.pokemon.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PokemonApiClient {
    private static PokemonApiClient instance;
    private final RestTemplate restTemplate;

    private PokemonApiClient() {
        this.restTemplate = new RestTemplate();
    }

    public static synchronized PokemonApiClient getInstance() {
        if (instance == null) {
            instance = new PokemonApiClient();
        }
        return instance;
    }

    public PokemonApiResponse getPokemonList(int offset, int limit) {
        String url = String.format("https://pokeapi.co/api/v2/pokemon?offset=%d&limit=%d", offset, limit);
        return restTemplate.getForObject(url, PokemonApiResponse.class);
    }
}
