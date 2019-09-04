package com.proyecto.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton  =  findViewById(R.id.bingresar);
    }


        public void acceder (View view){

            String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
            String contraseña = ((EditText) findViewById(R.id.txtcontraseña)).getText().toString();

            if (usuario.equals("admin") && contraseña.equals("admin")) {

                Intent nuevolayau = new Intent(MainActivity.this, segundo.class);
               startActivity(nuevolayau);


            } else
                Toast.makeText(getApplicationContext(), ("usuario o contraseña incorrecta"), Toast.LENGTH_SHORT).show();

        }





}
