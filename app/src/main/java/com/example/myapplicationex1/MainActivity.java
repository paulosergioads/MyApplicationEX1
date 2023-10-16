package com.example.myapplicationex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtEmail, edtSenha;
    Button btnBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnBoton = findViewById(R.id.btnBoton);

        btnBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent redirecionar = new Intent(MainActivity.this, MainActivityPrincipal.class);
                startActivity(redirecionar);
                )
            }
        });
    }
}



