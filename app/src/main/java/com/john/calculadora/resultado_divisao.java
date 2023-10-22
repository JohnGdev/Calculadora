package com.john.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado_divisao extends AppCompatActivity {

    private EditText txt_number1;
    private EditText txt_number2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_divisao);
        txt_number1 = findViewById(R.id.txt_number1);
        txt_number2 = findViewById(R.id.txt_number2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void dividir(View view) {
        double valor1 = Double.parseDouble(txt_number1.getText().toString());
        double valor2 = Double.parseDouble(txt_number2.getText().toString());
        double resultado = valor1 / valor2;
        if (resultado == (int) resultado) {
            // Se for um número inteiro, mostrar como inteiro
            int resultadoInteiro = (int) resultado;
            tvResultado.setText(String.valueOf(resultadoInteiro));
        } else {
            // Se não for um número inteiro, mostrar com um número após a casa decimal
            String resultadoFormatado = String.format("%.1f", resultado);
            tvResultado.setText(resultadoFormatado);
        }
    }
}