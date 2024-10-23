package com.gml.soap.pokemon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gml.soap.pokemon.client.PokemonApiClient;
import com.gml.soap.pokemon.client.PokemonApiResponse;
import com.gml.soap.pokemon.dto.PokemonDto;

@Service
public class PokemonService {
    private final PokemonApiClient apiClient;

    public PokemonService() {
        this.apiClient = PokemonApiClient.getInstance();
    }

    public List<PokemonDto> getPokemonList(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        PokemonApiResponse response = apiClient.getPokemonList(offset, pageSize);
        return response.getResults();
    }
}
