package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultCirculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_circulo);
        double result = getIntent().getDoubleExtra("resultado",-1);
        TextView novo = findViewById(R.id.textView12);
        String aux = "Área: "+result+"cm²";
        novo.setText(aux);
    }
}
