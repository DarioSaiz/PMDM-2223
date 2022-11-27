package com.example.pmdm_2223.EVA1.prueba_listado;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2223.R;

import java.util.ArrayList;
import java.util.Arrays;

public class userAdapter extends RecyclerView.Adapter<userAdapter.ViewHolder>{

    private ArrayList<Pokemon> datos;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name, number;

        private final ImageView sprite;

        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.nombrePokemon);
            sprite = v.findViewById(R.id.sprite);
            number = v.findViewById(R.id.numero);
        }

        public TextView getName() {return name;}

        public TextView getNumber(){return number;}

        public ImageView getSprite(){return sprite;}
    }

    public userAdapter(ArrayList<Pokemon> dataSet) {
        datos =dataSet;
        //datos.addAll(Arrays.asList(dataSet));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_contactos, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.getName().setText(datos.get(position).getNombre());
        //holder.getSprite().setImageResource(datos.get(position).getSprite());
        holder.getNumber().setText("Nº" + datos.get(position).getNumero());
        //GUARDAR URIS ES MEJOR ej: getsprite.setImageUri parsea si no tiene ruta
        //trycatch??
        ///drawable/p1.png
        Uri uriSprite = null;

        if (position<26){
            uriSprite = Uri.parse("android.resource://" + Listado.package_name + "/drawable/" +
                    datos.get(position).getSprite());
        }else{
            Log.d(TAG, datos.get(position).getSprite());
            uriSprite = Uri.parse(datos.get(position).getSprite());
        }

        holder.getSprite().setImageURI(uriSprite);
            /*
            * Uri imgUri=Uri.parse("android.resource://my.package.name/"+R.drawable.image);
              imageView.setImageURI(null);
              imageView.setImageURI(imgUri);
              *
              * Uri imgUri=Uri.parse("android.resource://"+getPackageName()+"/drawable/"+"p1");
                        imgSprite.setImageURI(null);
                        imgSprite.setImageURI(imgUri);
                        * CLAVE MUY CLAVE GUARDAS LOS SPRITES COMO NOMBRE Y SETEAS COMO URI DE ESTA FORMA*/

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}

