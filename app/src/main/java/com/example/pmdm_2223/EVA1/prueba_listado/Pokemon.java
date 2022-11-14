package com.example.pmdm_2223.EVA1.prueba_listado;

import com.example.pmdm_2223.R;

public class Pokemon {

    private static String []nombres={
            "Bulbasaur", "Ivysaur", "Venusaur", "Charmander",
            "Charmeleon", "Charizard", "Squirtle", "Wartortle",
            "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle",
            "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot",
            "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok",
            "Pikachu", "Raichu"
    };

    private static int sprites[]={
            R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,
            R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,
            R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14,R.drawable.p15,
            R.drawable.p16,R.drawable.p17,R.drawable.p18,R.drawable.p19,R.drawable.p20,
            R.drawable.p21,R.drawable.p22,R.drawable.p23,R.drawable.p24,R.drawable.p25,
            R.drawable.p26,
    };

    private String nombre;

    private int sprite;

    private String numero;

    public static final int POKEMONS_INICIALES = 26;

    public Pokemon() {}

    public Pokemon(String nombre, int sprite, String numero) {
        this.nombre = nombre;
        this.sprite=sprite;
        this.numero=numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {return numero;}

    public int getSprite(){return sprite;}

    public static Pokemon[] generarPokemons(int n){
        Pokemon[] pokemons =new Pokemon[n];
        for (int i = 0; i < POKEMONS_INICIALES; i++) {
            pokemons[i]=new Pokemon(nombres[i],sprites[i],"nº "+ i);
        }
        return pokemons;
    }
}
