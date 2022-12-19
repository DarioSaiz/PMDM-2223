package com.example.pmdm_2223.EVA2.ejemplo_observador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pmdm_2223.R;

import java.util.ArrayList;

public class EjemploObservador extends AppCompatActivity {

    RecyclerView rcv;
    ProductoAdapter a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo_observador);

        rcv = findViewById(R.id.recicladoObservador);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        a = new ProductoAdapter(Producto.generador());
        rcv.setAdapter(a);

        a.setClickListener(new ProductoAdapter.ItemClickListener() {
            @Override
            public void onClick(View view, Producto p) {

                Toast.makeText(EjemploObservador.this,"Pulsado "+p.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}