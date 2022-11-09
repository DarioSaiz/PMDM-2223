package com.example.pmdm_2223.EVA1.prueba_listado;

public class Pokemon {

    private String nombre;
    private String tipo;

    public static final int POKEMONS_INICIALES = 26;

    public Pokemon() {}

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static Pokemon[] generarPokemons(int n){
        Pokemon[] pokemons =new Pokemon[n];
        for (int i = 0; i < POKEMONS_INICIALES; i++) {
            pokemons[i]=new Pokemon("Pokemon"+(i+1));
        }
        return pokemons;
    }
}
