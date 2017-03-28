package com.example.ingenieria.pruebash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        String nom= (String) getIntent().getExtras().getSerializable("nombre");
        String ape= (String)getIntent().getExtras().getSerializable("apellidos");
        String edad= (String) getIntent().getExtras().getSerializable("edad");

        TextView textViewNombre= (TextView) findViewById(R.id.textViewNombre);
        TextView textViewApellidos= (TextView) findViewById(R.id.textViewApellidos);
        TextView textViewEdad= (TextView) findViewById(R.id.textViewEdad);

        textViewNombre.setText("Nombre: "+nom);
        textViewApellidos.setText("Apellidos: "+ape);
        textViewEdad.setText("Edad: "+edad);

    }
}