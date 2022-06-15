package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {



        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://pokeapi.co/api/v2/pokemon/";
        jsonGetter.run();

        PockemonList pockemonList = new ObjectMapper().readValue(jsonGetter.jsonIn,PockemonList.class);


        System.out.println( pockemonList);

//        System.out.println("Waiting for data...");
//        String jsonString = jsonGetter.jsonIn;
//        System.out.println(jsonString);
//
//        System.out.println("Imported data after parsing:\n" + jsonString);
//        System.out.println(jsonString);

        pockemonList.getList().sort(Pockemon.byNameAsc);
        System.out.println("After sorting by name ascending:\n" +  pockemonList);
        pockemonList.getList().sort(Pockemon.byNameDesc);
        System.out.println("After sorting by name descending:\n" +  pockemonList);


    }
}
