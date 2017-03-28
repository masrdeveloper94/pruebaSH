package com.example.ingenieria.pruebash;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ingenieria on 28/03/2017.
 */

public class DialogFragmento extends DialogFragment{

    TextView mTextNombre;
    TextView mTextApellidos;
    TextView mTextEdad;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vista, container, false);
        mTextNombre= (TextView) rootView.findViewById(R.id.textViewNomFragment);
        mTextApellidos= (TextView) rootView.findViewById(R.id.textViewApeFragment);
        mTextEdad= (TextView) rootView.findViewById(R.id.textViewEdadFragment);

        String nombre= (String)getArguments().getSerializable("nombre").toString();
        String apellidos=(String)getArguments().getSerializable("apellidos").toString();
        String edad= (String)getArguments().getSerializable("edad").toString();

        mTextNombre.setText("Nombre: "+nombre);
        mTextApellidos.setText("Apellidos: "+apellidos);
        mTextEdad.setText("Edad: "+edad);


        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        }
    }
}
