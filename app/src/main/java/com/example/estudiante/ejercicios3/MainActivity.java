package com.example.estudiante.ejercicios3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_titulo;
    EditText et_masa;
    EditText et_altura;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo =  findViewById(R.id.tv_titulo);
        et_masa = findViewById(R.id.et_masa);
        et_altura = findViewById(R.id.et_altura);
        btn_calcular = findViewById(R.id.btn_calcular);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double imc, masa, altura;
                masa = Double.parseDouble(et_masa.getText().toString());
                altura = Double.parseDouble(et_altura.getText().toString());

                imc = masa/Math.pow(altura,2);
                tv_titulo.setText("su indice de masa corporal es: "+ imc);

                //String nombre = et_nombre.getText().toString();
                Toast.makeText(MainActivity.this, "hola"+imc, Toast.LENGTH_LONG).show();
            }
        });
    }
}
