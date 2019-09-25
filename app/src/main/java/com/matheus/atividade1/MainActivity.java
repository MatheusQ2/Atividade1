package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void PegaCalculo(View view) {
        RadioGroup novo = findViewById(R.id.radioGroup);
        if(novo.getCheckedRadioButtonId() == R.id.radioButton){
            Intent novoCirculo = new Intent(this,Circulo.class);
            startActivity(novoCirculo);
        }else if (novo.getCheckedRadioButtonId() == R.id.radioButton2){
            Intent novoTrinagulo = new Intent(this,Triangulo.class);
            startActivity(novoTrinagulo);
        }else if(novo.getCheckedRadioButtonId() == R.id.radioButton3){
            Intent novoQuadrado = new Intent(this,Quadrado.class);
            startActivity(novoQuadrado);
        }

        finish();

    }
}
