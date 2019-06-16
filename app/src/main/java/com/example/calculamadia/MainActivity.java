package com.example.calculamadia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Declarando as variaveits
    private EditText txtNota1;
    private EditText txtNota2;
    private EditText txtNota3;
    private EditText txtNota4;
    private Button btncalcular;
    private TextView txtmediafinal;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNota1 = (EditText) findViewById(R.id.txtNota1);
        txtNota2 = (EditText) findViewById(R.id.txtNota2);
        txtNota3 = (EditText) findViewById(R.id.txtNota3);
        txtNota4 = (EditText) findViewById(R.id.txtNota4);
        btncalcular = (Button) findViewById(R.id.btncalcular);
        txtmediafinal = (TextView) findViewById(R.id.txtmediafinal);


        btncalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                nota1 = Double.parseDouble(txtNota1.getText().toString());
                nota2 = Double.parseDouble(txtNota2.getText().toString());
                nota3 = Double.parseDouble(txtNota3.getText().toString());
                nota4 = Double.parseDouble(txtNota4.getText().toString());

                Double media = calcularMedia(nota1, nota2, nota3, nota4);
                txtmediafinal.setText(media.toString());
            }
        });

    }

    private double calcularMedia(double n1, double n2, double n3, double n4) {
        double mediaFinal = (n1 + n2 + n3 +n4) / 4;
        return mediaFinal;
    }
}
