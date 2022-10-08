package com.example.pmdm_2223.practica_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.pmdm_2223.R;

public class MainActivity extends AppCompatActivity {

    Button sumador;
    Button restador;
    Button reseteador;
    TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumador=findViewById(R.id.botonsuma);
        restador=findViewById(R.id.botonresta);
        reseteador=findViewById(R.id.botonreset);
        contador=findViewById(R.id.contador);

        sumador.setOnClickListener(new Controlador(contador, sumador));
        restador.setOnClickListener(new Controlador(contador, restador));
        reseteador.setOnClickListener(new Controlador(contador,reseteador));
    }
}