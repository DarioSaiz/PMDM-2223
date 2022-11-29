package com.example.pmdm_2223.EVA1.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pmdm_2223.R;

import java.util.ArrayList;

public class Ejercicio1 extends AppCompatActivity {

    RecyclerView recyclerView;
    AdaptadorExamen adapter;

    public ArrayList<Examen>lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_examen);

        recyclerView=findViewById(R.id.exameReciclado);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lista= new ArrayList<>();

        lista.add(new Examen("examen"));

        adapter=new AdaptadorExamen(lista);
        recyclerView.setAdapter(adapter);
    }
}