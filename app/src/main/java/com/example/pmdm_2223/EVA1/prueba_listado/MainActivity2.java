package com.example.pmdm_2223.EVA1.prueba_listado;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pmdm_2223.R;


public class MainActivity2 extends AppCompatActivity {

    public static final int CODIGO_SUBIRPOKE=2;

    private Uri uriCapturada;

    EditText nombre, numero;
    Button vuelta, añadir;
    PokemonDAO pokeDAO;
    ImageView imgSprite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre=findViewById(R.id.nuevoNombrePkmn);
        numero=findViewById(R.id.nuevoNumPkmn);
        vuelta=findViewById(R.id.pokeAtras);
        añadir=findViewById(R.id.subirPoke);
        imgSprite=findViewById(R.id.pokeImg);

        TextView.OnEditorActionListener manejador = new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                return false;
            }
        };
        nombre.setOnEditorActionListener(manejador);
        numero.setOnEditorActionListener(manejador);

        ActivityResultLauncher<Intent>imgResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode()==RESULT_OK){
                        Intent data = result.getData();
                        uriCapturada = data.getData();
                        imgSprite.setImageURI(uriCapturada);
                    }
                }
        );

        imgSprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                i.putExtra(MediaStore.EXTRA_OUTPUT, uriCapturada);
                imgResult.launch(i);
            }
        });

        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uriCapturada != null) {
                    String pokeSprite=uriCapturada.getPath();
                    Log.d(TAG,"La ruta es"+pokeSprite);
                }
                //int pokeNum=Integer.parseInt(numero.getText().toString());
                //String pokeNom=nombre.getText().toString();


                /*if (pokeValidado(pokeNum, pokeNom)){
                    //Pokemon nuevoPoke = new Pokemon(pokeNom,pokeNum);
                }*/
            }
        });
    }

    public boolean pokeValidado(int pokeNum, String pokeNom){
        Pokemon pokeTemp= pokeDAO.findByNumber(pokeNum);
        return false;
    }
}