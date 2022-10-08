package com.example.pmdm_2223.practica_2_1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Controlador implements View.OnClickListener{

    Button b;
    TextView c;
    String id;
    Contador i = new Contador();

    public Controlador(TextView c, Button b){
        this.id=b.getResources().getResourceEntryName(b.getId());
        this.b=b;
        this.c=c;
    }

    @Override
    public void onClick(View view) {
        switch (id){
            case "botonreset":
                c.setText(String.valueOf(i.reset()));
                break;
            case "botonsuma":
                c.setText(String.valueOf(i.suma()));
                break;

            case "botonresta":
                c.setText(String.valueOf(i.resta()));
                break;

        }
    }
}
