package com.example.pmdm_2223.EVA1.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pmdm_2223.R;

public class ejercicio1 extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_examen);

        recyclerView=findViewById(R.id.exameReciclado);

    }
}