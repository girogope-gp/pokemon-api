package com.gml.soap.pokemon.client;

import java.util.List;

import com.gml.soap.pokemon.dto.PokemonDto;



public class PokemonApiResponse {
    private int count;
    private String next;
    private String previous;
    private List<PokemonDto> results;

    // getters and setters

    /**
     * @return int return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return String return the next
     */
    public String getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * @return String return the previous
     */
    public String getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * @return List<PokemonDto> return the results
     */
    public List<PokemonDto> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(List<PokemonDto> results) {
        this.results = results;
    }

}
