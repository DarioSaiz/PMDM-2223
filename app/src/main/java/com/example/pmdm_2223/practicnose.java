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
            setContentView(R.layout.activity_practicapiedrapapeltijera);

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
                    String maquina = IAmaquina();
                    String id=view.getResources().getResourceEntryName(view.getId());
                    switch (id){
                        case "botonPiedra":
                            PPT(id,maquina,resultado);
                            break;
                    }
                }
            };
            piedra.setOnClickListener(manejador);
        }
        protected String IAmaquina (){
            int objeto= (int) (Math.random()*3)+1;
            if (objeto == 1) {
                return "piedra";
            }
            if (objeto == 2) {
                return "tijera";
            }
            if (objeto == 3) {
                return "papel";
            }
            return null;

        }
        protected void PPT (String Y, String m, TextView r ){
            if (Y.equalsIgnoreCase(m)) {
                r.setText("Ha habido un empate");

            } else if (Y.equalsIgnoreCase("botonPiedra") && m.equalsIgnoreCase("tijera")){
                r.setText("Has Ganado");
            } else if (Y.equalsIgnoreCase("botonPapel") && m.equalsIgnoreCase("piedra")) {
                r.setText("Has Ganado");
            }  else if (Y.equalsIgnoreCase("botonTijera") && m.equalsIgnoreCase("papel")) {
                r.setText("Has Ganado");
            }  else  {
                r.setText("Has Perdido");
            }
        }
    }

