package com.example.pmdm_2223.EVA1.prueba_listado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.pmdm_2223.R;

public class Listado extends AppCompatActivity {

    RecyclerView rUser;
    Button add;
    userAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        rUser=findViewById(R.id.primerRV);

        rUser.setHasFixedSize(true);

        rUser.setLayoutManager(new LinearLayoutManager(this));

        adapter= new userAdapter(new Pokemon().generarPokemons(Pokemon.POKEMONS_INICIALES));
        rUser.setAdapter(adapter);

    }
}