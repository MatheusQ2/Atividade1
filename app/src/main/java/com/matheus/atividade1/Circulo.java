package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.EditText;


public class Circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
    }


    public void MostraResultado(View view) {
        EditText novo = findViewById(R.id.numero);
         int numero = Integer.parseInt(novo.getText().toString());
         double pi = 3.1416;
         double rest = pi * numero;
        Intent novaJanela = new Intent(this,ResultCirculo.class);
        novaJanela.putExtra("resultado",rest);
        startActivity(novaJanela);
    }
}
