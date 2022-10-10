package com.example.pmdm_2223;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class pruebaEditText extends AppCompatActivity {

    TextView nombre, mail,usuario,todo;
    EditText editNombre, editMail, editUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebaeditext);

        todo=findViewById(R.id.verTodo);
        editNombre=findViewById(R.id.editNombre);
        editMail=findViewById(R.id.editMail);
        editUser=findViewById(R.id.editUser);

        editNombre.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_GO) {
                    todo.setText(editNombre.getText());
                    todo.setTextColor(Color.RED);

                    //OCULTAR TECLADO
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(editNombre.getWindowToken(),0);
                    return true;
                }
                return false;
            }
        });
        editMail.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_GO) {
                    todo.setText(editMail.getText());
                    todo.setTextColor(Color.RED);

                    //OCULTAR TECLADO
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(editMail.getWindowToken(),0);
                    return true;
                }
                return false;
            }
        });
        editUser.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_GO) {
                    todo.append("\n"+editUser.getText());
                    todo.setTextColor(Color.RED);

                    //OCULTAR TECLADO
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(editUser.getWindowToken(),0);
                    return true;
                }
                return false;
            }
        });
    }
}