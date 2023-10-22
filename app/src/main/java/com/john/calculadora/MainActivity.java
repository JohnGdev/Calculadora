package com.john.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView bt_mais;
    private TextView bt_menos;
    private TextView bt_dividir;
    private TextView bt_multiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarComponentes();
        bt_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resultado.class);
                startActivity(intent);

            }

        });
        bt_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resultado_subtracao.class);
                startActivity(intent);

            }

        });
        bt_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resultado_divisao.class);
                startActivity(intent);

            }

        });
        bt_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resultado_multiplicacao.class);
                startActivity(intent);

            }

        });
    }
    private void IniciarComponentes(){
        bt_mais = findViewById(R.id.bt_mais);
        bt_menos = findViewById(R.id.bt_menos);
        bt_dividir = findViewById(R.id.bt_dividir);
        bt_multiplicar = findViewById(R.id.bt_multiplicar);

    }
}