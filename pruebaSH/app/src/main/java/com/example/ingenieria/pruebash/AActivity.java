package com.example.ingenieria.pruebash;

import android.app.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AActivity extends AppCompatActivity {

    EditText mEditNombre;
    EditText mEditApellidos;
    EditText mEditEdad;
    Button mButtonLaunch;
    Button mButtonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        mEditNombre= (EditText) findViewById(R.id.editTextNom);
        mEditApellidos= (EditText) findViewById(R.id.editTextApellidos);
        mEditEdad= (EditText) findViewById(R.id.editTextEdad);
        mButtonLaunch= (Button) findViewById(R.id.buttonLaunch);
        mButtonFragment= (Button) findViewById(R.id.buttonFragment);

        mButtonLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!mEditNombre.equals("") && !mEditApellidos.equals("") && !mEditEdad.equals("")){
                    String nombre= mEditNombre.getText().toString();
                    String apellidos= mEditApellidos.getText().toString();
                    String edad= mEditEdad.getText().toString();
                    Intent intent= new Intent(getApplicationContext(),BActivity.class);
                    intent.putExtra("nombre",nombre);
                    intent.putExtra("apellidos",apellidos);
                    intent.putExtra("edad",edad);
                    startActivity(intent);
                }
            }
        });

        mButtonFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                if(!mEditNombre.equals("") && !mEditApellidos.equals("") && !mEditEdad.equals("")) {
                    String nombre = mEditNombre.getText().toString();
                    String apellidos = mEditApellidos.getText().toString();
                    String edad = mEditEdad.getText().toString();

                    bundle.putSerializable("nombre",nombre);
                    bundle.putSerializable("apellidos",apellidos);
                    bundle.putSerializable("edad",edad);



                    FragmentManager fm = getFragmentManager();
                    DialogFragmento dialogFragment = new DialogFragmento();
                    dialogFragment.setArguments(bundle);
                    dialogFragment.show(fm, "Sample Fragment");
                }
            }
        });
    }
}
