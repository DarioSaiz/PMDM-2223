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
import java.util.List;

public class userAdapter<Contactos> extends RecyclerView.Adapter<userAdapter.ViewHolder>{

    private ArrayList<Contacto> datos;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.contacto);
        }
    }

    public userAdapter(Contacto[] dataSet) {
        datos = new ArrayList<>();
        datos.addAll(Arrays.asList(dataSet));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_contactos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = datos.get(position).getNombre();
        holder.name.setText(name);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}

