package com.example.pmdm_2223.piedrapapeltijera;

import android.view.View;

public class Manejador implements View.OnClickListener {
    @Override
    public void onClick(View view) {

        String id=view.getResources().getResourceEntryName(view.getId());
        switch (id){
            case "botonPiedra":

                break;
        }
    }
}