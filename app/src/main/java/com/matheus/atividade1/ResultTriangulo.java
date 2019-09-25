package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultTriangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_triangulo);
        float result = getIntent().getFloatExtra("resultado",-1);
        TextView novo = findViewById(R.id.textView11);
        String aux = "Área: "+result+"cm²";
        novo.setText(aux);
    }
}
