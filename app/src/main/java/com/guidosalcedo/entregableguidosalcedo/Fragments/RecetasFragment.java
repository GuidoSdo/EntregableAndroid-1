package com.guidosalcedo.entregableguidosalcedo.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.guidosalcedo.entregableguidosalcedo.Datos.DataProvider;
import com.guidosalcedo.entregableguidosalcedo.Datos.Receta;
import com.guidosalcedo.entregableguidosalcedo.R;
import com.guidosalcedo.entregableguidosalcedo.RecetaAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetasFragment extends Fragment implements RecetaAdapter.EscuchadorRecetas {

    private ComunicadorFragmentAlActivity comunicadorFragmentAlActivity;
    private EditText editTextBuscador;



    public RecetasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        DataProvider unDataProvider = new DataProvider();
        List<Receta> listaDeRecetas;


        View viewRecetasFragment = inflater.inflate(R.layout.fragment_recetas, container, false);

        RecyclerView recyclerViewRecetas = viewRecetasFragment.findViewById(R.id.recyclerViewRecetas);

        listaDeRecetas = unDataProvider.getListaRecetas();

        final RecetaAdapter adapter = new RecetaAdapter(listaDeRecetas,this);

        recyclerViewRecetas.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerViewRecetas.setLayoutManager(layoutManager);

        editTextBuscador = viewRecetasFragment.findViewById(R.id.editTextBuscador);

        editTextBuscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        return viewRecetasFragment;






    }


/*
    private void filter(String text){

        List<Receta> listaRecetas = DataProvider.listaDeRecetas;
        List<Receta> listaDeRecetasFiltrada = new ArrayList<>();

        for (Receta item : listaRecetas) {
            if (item..toLowerCase().contains(text.toLowerCase())); {
                listaDeRecetasFiltrada.add(item);
            }
        }

        mAdapter.listaDeRecetasFiltrada(filte)


    }*/




    // Interface que me pide el Adapter
    @Override
    public void recibirMensajeDelAdapter(Integer posicion) {
        comunicadorFragmentAlActivity.clickEnCelda(posicion);

    }

    // Interface para comunicar a un x activity
    public interface ComunicadorFragmentAlActivity {
        public void clickEnCelda(Integer posicionRecetaSeleccionada);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.comunicadorFragmentAlActivity = (ComunicadorFragmentAlActivity) context;
    }
}
