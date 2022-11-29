package com.example.pmdm_2223.EVA1.examen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2223.R;

import java.util.ArrayList;

public class AdaptadorExamen extends RecyclerView.Adapter<AdaptadorExamen.ViewHolder>{

    private ArrayList<Examen> datos;

    public AdaptadorExamen(ArrayList<Examen> dataSet){
        datos=dataSet;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView nombre;

        public ViewHolder(View v) {
            super(v);
            nombre=v.findViewById(R.id.nombreExamen);
        }

        public TextView getNombre() {
            return nombre;
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_examen,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getNombre().setText(datos.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}