package com.example.pmdm_2223.EVA1.prueba_listado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2223.R;

import java.util.ArrayList;
import java.util.Arrays;

public class userAdapter extends RecyclerView.Adapter<userAdapter.ViewHolder>{

    private ArrayList<Pokemon> datos;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;

        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.nombrePokemon);
        }

        public TextView getName() {
            return name;
        }
    }

    public userAdapter(Pokemon[] dataSet) {
        datos = new ArrayList<>();
        datos.addAll(Arrays.asList(dataSet));
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
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}

