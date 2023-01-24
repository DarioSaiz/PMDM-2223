package com.example.pmdm_2223.EVA2.retrofit_listview;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pmdm_2223.EVA2.ejemplo_observador.EjemploObservador;
import com.example.pmdm_2223.EVA2.retrofit_listview.data.Volume;
import com.example.pmdm_2223.EVA2.retrofit_listview.data.VolumesResponse;
import com.example.pmdm_2223.R;

public class ProyectoLibreria extends AppCompatActivity {

    TextView busqueda, autor;
    Button buscar;
    RecyclerView lista;
    BookSearchViewModel vm;
    LiveData<VolumesResponse> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_booksearch);

        busqueda = findViewById(R.id.id_busqueda);
        autor = findViewById(R.id.id_autor);
        buscar = findViewById(R.id.id_buscar);
        lista = findViewById(R.id.id_lista_libros);

        BookSearchResultsAdapter adapter = new BookSearchResultsAdapter();
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setAdapter(adapter);

        adapter.setClickListener(new BookSearchResultsAdapter.ItemClickListener() {
            @Override
            public void onClick(View view, String v) {
                Toast.makeText(ProyectoLibreria.this,"Pulsado "+ v, Toast.LENGTH_SHORT).show();
            }
        });

        vm = new ViewModelProvider(this).get(BookSearchViewModel.class);
        vm.init();
        data = vm.getVolumesResponseLiveData();
        data.observe(this, (dato)->{
            adapter.setResults(dato.getItems());
        });

        buscar.setOnClickListener(view -> {
            vm.searchVolumes(busqueda.getText().toString(),autor.getText().toString());
        });
    }
}