package com.example.pmdm_2223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class practicnose extends AppCompatActivity {

    TextView resultado, resultadoYo, resultadoM;
    ImageButton piedra, papel, tijera;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicnose);

        resultado=findViewById(R.id.resultado);
        resultadoYo=findViewById(R.id.marcadorYo);
        resultadoM=findViewById(R.id.marcadorM);
        piedra=findViewById(R.id.botonPiedra);
        papel=findViewById(R.id.botonPapel);
        tijera=findViewById(R.id.botonTijera);
        reset=findViewById(R.id.botonReset);

        View.OnClickListener manejador= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int maquina = iaMaquina();
                String id=view.getResources().getResourceEntryName(view.getId());
                switch (id){
                    case "botonPiedra":
                      PPT(1,maquina,resultado);
                    break;
                }
            }
        };
        piedra.setOnClickListener(manejador);
        papel.setOnClickListener(manejador);
        tijera.setOnClickListener(manejador);
    }
    protected int iaMaquina (){return (int) (Math.random()*3)+1;}
    protected void PPT (int y, int m, TextView r ){}
}
