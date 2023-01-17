package com.example.pmdm_2223.EVA2.ejemplo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.pmdm_2223.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class calculadora_api extends AppCompatActivity {
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_suma_api);

        label = findViewById(R.id.id_api_label);

        Call<Resultado> llamada = MatesAPI.getInstance().suma(7,8);

        llamada.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                label.setText(response.body().resultado);
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {
                label.setText("ERROR");
            }
        });
    }
}