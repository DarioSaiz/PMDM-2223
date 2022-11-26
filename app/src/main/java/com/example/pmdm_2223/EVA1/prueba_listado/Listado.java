package com.example.pmdm_2223.EVA1.prueba_listado;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        add = findViewById(R.id.addPoke);

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

        ActivityResultLauncher miResultadoLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result ->{
                    Log.d(TAG,"VUELVE CANCELADO");
                    int code = result.getResultCode();
                    switch (code){
                        case RESULT_CANCELED:
                            break;
                        case MainActivity2.CODIGO_SUBIRPOKE:
                                Log.d(TAG,"Se ha recibido un pokemon");
                                Intent intent = result.getData();
                            break;
                    }
                });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Listado.this,MainActivity2.class);
                miResultadoLauncher.launch(intent);
            }
        });
    }
}