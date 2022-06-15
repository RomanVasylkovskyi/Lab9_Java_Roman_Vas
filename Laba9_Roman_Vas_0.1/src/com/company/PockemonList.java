package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PockemonList implements java.io.Serializable{
    private ArrayList<Pockemon> results;
    public ArrayList<Pockemon> getList() {
        return results;
    }


    public void PockemonList(ArrayList<Pockemon> pockemon) {
        this.results = pockemon;
    }

    public void setResults(ArrayList<Pockemon> results) {
        this.results = results;
    }

    public void PockemonList() {
        results = new ArrayList<>();
    }

    public void add(Pockemon pockemon) {
        this.results.add(pockemon);
    }

    @Override
    public String toString() {
        return "PockemonList{" +
                "earthquakes=" + results +
                '}';
    }
}