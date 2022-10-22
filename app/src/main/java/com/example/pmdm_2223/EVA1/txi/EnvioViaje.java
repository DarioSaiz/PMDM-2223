package com.example.pmdm_2223.EVA1.txi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.example.pmdm_2223.R;

public class EnvioViaje extends AppCompatActivity {
    TextView switchI, switchV;
    EditText horaIda, horaVuelta, fechaIda,fechaVuelta, DNI, direccionRecogida, nombre;
    Spinner ciudadesO, ciudadesD;
    Switch switchIdaVuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envioviaje);

        horaIda=findViewById(R.id.fechaIda);
        horaVuelta=findViewById(R.id.horaVuelta);
        fechaIda=findViewById(R.id.horaIda);
        fechaVuelta=findViewById(R.id.fechaVuelta);
        DNI=findViewById(R.id.vDNI);
        direccionRecogida=findViewById(R.id.vDireccion);
        nombre=findViewById(R.id.vNombre);
        ciudadesO=findViewById(R.id.ciudadesOrigen);
        ciudadesD=findViewById(R.id.ciudadesDestino);
        switchIdaVuelta=findViewById(R.id.switchIdaVuelta);
        switchI=findViewById(R.id.switchIda);
        switchV=findViewById(R.id.switchVuelta);

        switchIdaVuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchIdaVuelta.isChecked()){
                    switchV.setVisibility(View.VISIBLE);
                    switchI.setVisibility(View.INVISIBLE);
                    fechaVuelta.setVisibility(View.VISIBLE);
                    horaVuelta.setVisibility(View.VISIBLE);
                } else {
                    switchV.setVisibility(View.INVISIBLE);
                    switchI.setVisibility(View.VISIBLE);
                    fechaVuelta.setVisibility(View.INVISIBLE);
                    horaVuelta.setVisibility(View.INVISIBLE);
                }
            }
        });




    }
}