package com.guidosalcedo.entregableguidosalcedo.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.guidosalcedo.entregableguidosalcedo.Datos.DataProvider;
import com.guidosalcedo.entregableguidosalcedo.Datos.Receta;
import com.guidosalcedo.entregableguidosalcedo.R;

import org.w3c.dom.Text;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetaDetalleFragment extends Fragment {
    private TextView textViewTitulo;
    private TextView textViewIngredientes;
    private TextView textViewPreparacion;
    private ImageView imageViewDetalleImagen;
    private DataProvider dataProvider;

    public RecetaDetalleFragment() {
        // Required empty public constructor
    }

    static public RecetaDetalleFragment crearFragmentoDetalle(Integer posicion){

        RecetaDetalleFragment fragmentoDetalle = new RecetaDetalleFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("posicion", posicion);
        fragmentoDetalle.setArguments(bundle);

        return fragmentoDetalle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta_detalle, container, false);

        textViewTitulo = view.findViewById(R.id.textViewTitulo);
        textViewIngredientes = view.findViewById(R.id.textViewIngredientes);
        textViewPreparacion = view.findViewById(R.id.textViewPreparacion);
        imageViewDetalleImagen = view.findViewById(R.id.imageViewImagenDetalle);
        dataProvider = new DataProvider();

        Bundle unBundle = getArguments();
        Integer posicion = unBundle.getInt("posicion");
        Receta recetaSeleccionada = dataProvider.getListaRecetas().get(posicion);

        textViewTitulo.setText(recetaSeleccionada.getTitulo());
        textViewIngredientes.setText(recetaSeleccionada.getIngredientes());
        textViewPreparacion.setText(recetaSeleccionada.getPreparacion());
        imageViewDetalleImagen.setImageResource(recetaSeleccionada.getImagen());

        return view;
    }


}
