package com.ama.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etxtNum1 = findViewById(R.id.etxtNum1);
        final EditText etxtNum2 = findViewById(R.id.etxtNum2);

        final TextView txtResultado = findViewById(R.id.txtResultado);
        final TextView txtOperador = findViewById(R.id.txtOperador);

        Button btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((etxtNum1.getText().length() != 0)&&(etxtNum2.getText().length() != 0)){
                    int num1 = Integer.parseInt(etxtNum1.getText().toString());
                    int num2 = Integer.parseInt(etxtNum2.getText().toString());

                    int resultado = num1 + num2;

                    txtOperador.setText("+");
                    txtResultado.setText(resultado+"");
                }else
                    Toast.makeText(MainActivity.this, "Ingresa numeros en ambos campos", Toast.LENGTH_SHORT).show();

            }
        });

        Button btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((etxtNum1.getText().length() != 0)&&(etxtNum2.getText().length() != 0)){
                    int num1 = Integer.parseInt(etxtNum1.getText().toString());
                    int num2 = Integer.parseInt(etxtNum2.getText().toString());

                    int resultado = num1 - num2;

                    txtOperador.setText("-");
                    txtResultado.setText(resultado+"");
                }else
                    Toast.makeText(MainActivity.this, "Ingresa numeros en ambos campos", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnMulti = findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((etxtNum1.getText().length() != 0)&&(etxtNum2.getText().length() != 0)){
                    int num1 = Integer.parseInt(etxtNum1.getText().toString());
                    int num2 = Integer.parseInt(etxtNum2.getText().toString());

                    int resultado = num1 * num2;


                    txtOperador.setText("X");
                    txtResultado.setText(resultado+"");
                }else
                    Toast.makeText(MainActivity.this, "Ingresa numeros en ambos campos", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnDividir = findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((etxtNum1.getText().length() != 0)&&(etxtNum2.getText().length() != 0)){
                    double num1 = Double.parseDouble(etxtNum1.getText().toString());
                    double num2 = Double.parseDouble(etxtNum2.getText().toString());
                    if(num2 != 0){
                        double resultado = num1 / num2;
                        txtOperador.setText("/");
                        txtResultado.setText(String.format("%.2f",resultado));
                    }else
                        Toast.makeText(MainActivity.this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Ingresa numeros en ambos campos", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
