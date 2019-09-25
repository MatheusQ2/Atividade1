package com.matheus.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
    }

    public void PagaMValor(View view) {
        EditText base = findViewById(R.id.base);
        EditText altura = findViewById(R.id.altura);
        float numero1 = Float.parseFloat(base.getText().toString());
        float numero2 = Float.parseFloat(altura.getText().toString());
        float area = (numero1 * numero2)/2;
        Intent novaJanela = new Intent(this,ResultTriangulo.class);
        novaJanela.putExtra("resultado",area);
        startActivity(novaJanela);

    }
}
