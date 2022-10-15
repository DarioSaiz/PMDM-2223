package com.example.pmdm_2223.piedrapapeltijera;

public class IAMaquina {

    int puntuación;

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }
    public int gana(){
        return puntuación++;
    }

    public int pierde(){
        return puntuación--;
    }
    protected int randomMaquina (){return (int) (Math.random()*3)+1;}
}
