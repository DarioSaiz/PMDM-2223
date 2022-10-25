package com.example.pmdm_2223.EVA1.testLanzarEnviar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.pmdm_2223.R;

import org.w3c.dom.Text;

public class A2 extends AppCompatActivity {

    public static final int CODIGO_VUELTALIMPIAR =2;
    public static final int CODIGO_VUELTA_TEXTO = 3;
    public static final String MSG = "";

    TextView recibeA1;
    Button vuelta, nuevaA1, reverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        recibeA1=findViewById(R.id.textoA1);
        vuelta=findViewById(R.id.bvuelta);
        nuevaA1=findViewById(R.id.bA1Nueva);
        reverse=findViewById(R.id.breverse);

    }
}