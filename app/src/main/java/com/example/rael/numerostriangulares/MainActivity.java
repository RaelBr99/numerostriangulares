package com.example.rael.numerostriangulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar (View view){
        EditText textonumero = (EditText) findViewById(R.id.cajanumero);
        TextView mensajefinal = (TextView) findViewById(R.id.mensaje);

        String sNumber = textonumero.getText().toString().trim();
        Integer number = Integer.parseInt(sNumber);

        String message;

        if (IsSquareNumber(number)) {
            message = sNumber + " Es un numero cuadrado";
        } else {
            if (IsTriangularNumber(number)) {
                message = sNumber + " Es un numero triangular";
            } else {
                message = sNumber + " No es un numero cuadrado ni triangularr";
            }
        }

        mensajefinal.setText(message);
    }

    public boolean IsSquareNumber(int number) {
        double squareRoot = Math.sqrt(number);

        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsTriangularNumber(int number) {
        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++; // <- This is the same as x = x + 1;
            triangularNumber += x; // <- This is the same as triangularNumber = triangularNumber + x;
        }

        if (triangularNumber == number) {
            return true;
        } else {
            return false;
        }
    }
}




