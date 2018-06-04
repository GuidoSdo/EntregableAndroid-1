package com.guidosalcedo.entregableguidosalcedo.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


    public RecetasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        DataProvider unDataProvider  = new DataProvider();
        List<Receta> listaDeRecetas;

        View viewRecetasFragment = inflater.inflate(R.layout.fragment_recetas, container, false);

        RecyclerView recyclerViewRecetas = viewRecetasFragment.findViewById(R.id.recyclerViewRecetas);

        listaDeRecetas = unDataProvider.getListaRecetas();

        final RecetaAdapter adapter = new RecetaAdapter(listaDeRecetas,this);

        recyclerViewRecetas.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerViewRecetas.setLayoutManager(layoutManager);


        return viewRecetasFragment;
    }

    // Interface que me pide el Adapter
    @Override
    public void recibirMensajeDelAdapter(Integer posicionRecetaSeleccionada) {
        comunicadorFragmentAlActivity.clickEnCelda(posicionRecetaSeleccionada);

    }

    // Interface para comunicar a un activity
    public interface ComunicadorFragmentAlActivity {
        public void clickEnCelda(Integer posicionRecetaSeleccionada);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.comunicadorFragmentAlActivity = (ComunicadorFragmentAlActivity) context;
    }
}
