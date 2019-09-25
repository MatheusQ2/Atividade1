package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultQuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quadrado);
        float rest = getIntent().getFloatExtra("resultado",-1);
        TextView texto = findViewById(R.id.textView10);
        String novo = "Área: "+rest+"cm²";
        texto.setText(novo);
    }
}
