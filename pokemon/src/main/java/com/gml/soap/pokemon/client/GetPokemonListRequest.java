package com.gml.soap.pokemon.client;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPokemonListRequest")
public class GetPokemonListRequest {

    private int page;
    private int pageSize;

    @XmlElement(name = "page")
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @XmlElement(name = "pageSize")
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
