
package com.example.pmdm_2223.EVA2.autentificacion;

import static androidx.constraintlayout.widget.StateSet.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.pmdm_2223.EVA2.autentificacion.data.QuestionResponse;
import com.example.pmdm_2223.R;

import java.util.List;

public class Auth_lista extends AppCompatActivity {
    LoginViewModel vm;
    LiveData <List<QuestionResponse>> listLiveData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_lista);

        Intent intent = getIntent();

        String token = intent.getStringExtra(Auth_main.TOKEN);

        vm = new ViewModelProvider(this).get(LoginViewModel.class);
        vm.init();

        listLiveData = vm.getQuestionListLiveData();

        listLiveData.observe(this, (dato) ->{
            for (QuestionResponse data : dato) {
                Log.d(TAG, "returned: " + data.getQuestionText());
            }
        });

        vm.getQuestions(token);
    }
}