package com.guidosalcedo.entregableguidosalcedo;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.guidosalcedo.entregableguidosalcedo.Datos.Receta;

import java.util.List;


public class RecetaAdapter extends RecyclerView.Adapter {

    private List<Receta> listaDeRecetas;
    private EscuchadorRecetas escuchadorRecetas;

    public RecetaAdapter(List<Receta> listaDeRecetas,EscuchadorRecetas unEscuchadorDeRecetas) {
        this.listaDeRecetas = listaDeRecetas;
        this.escuchadorRecetas = unEscuchadorDeRecetas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View celda =  layoutInflater.inflate(R.layout.celda_receta,parent,false);
        RecetaViewHolder recetaViewHolder = new RecetaViewHolder(celda);

        return recetaViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Receta receta = listaDeRecetas.get(position);
        RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;
        recetaViewHolder.asignarReceta(receta);

    }

    @Override
    public int getItemCount() {

        return listaDeRecetas.size();

    }

    public void agregarReceta(Receta unaReceta){

        listaDeRecetas.add(unaReceta);
        notifyDataSetChanged();
    }

    private class RecetaViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitulo;
        private TextView textViewIngredientes;
        private ImageView imageViewImagen;

        public RecetaViewHolder(final View itemView) {
            super(itemView);

            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewIngredientes = itemView.findViewById(R.id.textViewIngredientes);
            imageViewImagen = itemView.findViewById(R.id.imageViewImagen);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Integer posicionCeldaSeleccionada = getAdapterPosition();
                    escuchadorRecetas.recibirMensajeDelAdapter(posicionCeldaSeleccionada);

                }
            });
    }

        public void asignarReceta(Receta unaReceta) {

            textViewTitulo.setText(unaReceta.getTitulo());
            textViewIngredientes.setText(unaReceta.getIngredientes());
            imageViewImagen.setImageResource(unaReceta.getImagen());
        }
    }

    public interface EscuchadorRecetas{
        void recibirMensajeDelAdapter(Integer posicion);
    }
}
