package com.guidosalcedo.entregableguidosalcedo.Datos;



import com.guidosalcedo.entregableguidosalcedo.R;

import java.util.ArrayList;
import java.util.List;



public class DataProvider {
    List<Receta> listaDeRecetas = new ArrayList<>();


    public  List<Receta> getListaRecetas() {


        listaDeRecetas.add(new Receta("Empanadas", R.drawable.cobarde, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Sopa", R.drawable.dexter, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Carne", R.drawable.goku, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Banana", R.drawable.heman, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Manzana", R.drawable.higuain, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Empanadas", R.drawable.cobarde, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Sopa", R.drawable.dexter, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Carne", R.drawable.goku, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Banana", R.drawable.heman, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Manzana", R.drawable.higuain, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Empanadas", R.drawable.cobarde, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Sopa", R.drawable.dexter, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Carne", R.drawable.goku, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Banana", R.drawable.heman, "carne,azucar,agua", "cocinar"));
        listaDeRecetas.add(new Receta("Manzana", R.drawable.higuain, "carne,azucar,agua", "cocinar"));


        return listaDeRecetas;
    }

 /*   public  Receta buscarReceta(Integer posicion) {
        getListaRecetas();

        for (Receta recetaDelFor : listaDeRecetas) {
            if (posicion.equals(listaDeRecetas.indexOf(recetaDelFor))) {
                return recetaDelFor;
            }

        }


        return null;
    }
*/

}