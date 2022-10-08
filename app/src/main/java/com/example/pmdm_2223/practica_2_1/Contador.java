package com.example.pmdm_2223.practica_2_1;

import android.widget.TextView;

public class Contador {

    int cont;

    public Contador(){
        this.cont=0;
    }

    public int suma(){
        return cont++;
    }

    public int resta(){
        return cont--;
    }

    public int reset(){
        return 0;
    }
}
