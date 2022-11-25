package com.example.pmdm_2223.EVA1.prueba_listado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Button;

import com.example.pmdm_2223.R;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {

    RecyclerView rUser;
    Button add;
    userAdapter adapter;
    AppDatabase db;
    PokemonDAO pokemonDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        rUser=findViewById(R.id.primerRV);

        db= Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"Pokemon").allowMainThreadQueries().build();

        pokemonDAO=db.pokemonDAO();

        rUser.setHasFixedSize(true);

        rUser.setLayoutManager(new LinearLayoutManager(this));

        Pokemon[] pokemons=new Pokemon().generarPokemons(Pokemon.POKEMONS_INICIALES);
        adapter=new userAdapter(pokemons) ;
        ArrayList<Pokemon> comprueba = new ArrayList(pokemonDAO.getAll());
        if (comprueba.size()==0){
            pokemonDAO.insertAll(pokemons);
        }
        rUser.setAdapter(adapter);
    }
}