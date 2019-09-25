package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Quadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);
    }

    public void PegaValorQuadrado(View view) {
        EditText base = findViewById(R.id.editText);
        EditText altura = findViewById(R.id.editText2);
        float numero1 = Float.parseFloat(base.getText().toString());
        float numero2 = Float.parseFloat(altura.getText().toString());
        float result = numero1 * numero2;
        Intent newJanela = new Intent(this,ResultQuadrado.class);
        newJanela.putExtra("resultado",result);
        startActivity(newJanela);

    }
}
