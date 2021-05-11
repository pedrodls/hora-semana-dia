package com.example.numeroprimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificar(View view) {

        Integer hora = 0, semana = 0, dias = 0, horas=0;

        EditText caixaHora = (EditText) findViewById(R.id.caixaHora);

        try{

            hora = Integer.parseInt(caixaHora.getText()+"");

            while (hora>24){

                if(hora>24){
                    dias++;
                }

                if((hora/24))

            }

        }catch (Exception ex){
            Toast.makeText(this, "Preecha o campo", Toast.LENGTH_LONG).show();
        }
    }
}