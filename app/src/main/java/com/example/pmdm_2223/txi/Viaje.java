package com.example.pmdm_2223.txi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.example.pmdm_2223.R;

public class Viaje extends AppCompatActivity {
    TextView textoCiudad, textoHora;
    EditText horaIda, horaVuelta, diaIda,diaVuelta, dniPasajero, direccionRecogida, nombrePasajero;
    Spinner ciudadesIda, ciudadesVuelta;
    Switch switchIdaVuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viaje);

        horaIda=findViewById(R.id.horaIda);
        horaVuelta=findViewById(R.id.horaVuelta);
        diaIda=findViewById(R.id.diaIda);
        diaVuelta=findViewById(R.id.diaVuelta);
        dniPasajero=findViewById(R.id.dniPasajero);
        direccionRecogida=findViewById(R.id.direccionRecogida);
        nombrePasajero=findViewById(R.id.nombrePasajero);
        ciudadesIda=findViewById(R.id.ciudadesIda);
        ciudadesVuelta=findViewById(R.id.ciudadesVuelta);
        switchIdaVuelta=findViewById(R.id.switchIdaVuelta);
        textoCiudad=findViewById(R.id.textoCiudad);
        textoHora=findViewById(R.id.textoHora);


        switchIdaVuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchIdaVuelta.isChecked()){
                    horaVuelta.setVisibility(View.VISIBLE);
                    diaVuelta.setVisibility(View.VISIBLE);
                    ciudadesVuelta.setVisibility(View.VISIBLE);
                    textoCiudad.setVisibility(View.VISIBLE);
                    textoHora.setVisibility(View.VISIBLE);
                } else {
                    horaVuelta.setVisibility(View.INVISIBLE);
                    diaVuelta.setVisibility(View.INVISIBLE);
                    ciudadesVuelta.setVisibility(View.INVISIBLE);
                    textoCiudad.setVisibility(View.INVISIBLE);
                    textoHora.setVisibility(View.INVISIBLE);
                }
            }
        });




    }
}