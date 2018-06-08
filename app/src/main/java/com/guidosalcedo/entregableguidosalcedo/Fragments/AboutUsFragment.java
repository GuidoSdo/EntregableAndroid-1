package com.guidosalcedo.entregableguidosalcedo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.guidosalcedo.entregableguidosalcedo.R;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

    private TextView textViewTexto;

    public AboutUsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        textViewTexto = view.findViewById(R.id.textViewTexto);

        textViewTexto.setText("Venezuela, oficialmente denominada República Bolivariana de Venezuela," +
                "7\u200Bn 1\u200B es un país de América situado en la parte septentrional de América del Sur," +
                " constituido por una parte continental y por un gran número de islas pequeñas e islotes en el mar" +
                " Caribe, cuya capital y mayor aglomeración urbana es la ciudad de Caracas");



        return view;
    }

}
