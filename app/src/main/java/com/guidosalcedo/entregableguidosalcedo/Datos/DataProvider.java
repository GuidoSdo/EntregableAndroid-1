package com.guidosalcedo.entregableguidosalcedo.Datos;



import com.guidosalcedo.entregableguidosalcedo.R;

import java.util.ArrayList;
import java.util.List;



public class DataProvider {

    public static List<Receta> listaDeRecetas = new ArrayList<>();


    public  List<Receta> getListaRecetas() {


        listaDeRecetas.add(new Receta("Empanadas de Carne", R.drawable.empanada, "24 tapas de empanada, 1/2 kg carne picada, 2 cebollas, 2 huevos +" +
                "sal, pimienta, oregano a gusto", "1- Cortar cebollas y colocar en recipiente" +
                "2- Agregar carne picada y condimentar" +
                "3- Dejar asentar la mezcla" +
                "4- Rellenar tapas con relleno" +
                "5- Cocinar en horno a temperatura 180°c"));
        listaDeRecetas.add(new Receta("Sopa de Dexter", R.drawable.dexter, "carne humana,azucar,agua, especias tropicales, manzanas", "cocinar a fuego semirapido"));
        listaDeRecetas.add(new Receta("Canelones al estilo Goku", R.drawable.goku, "carne de Saiyajin,azucar,agua, 4 esferas del dragon", "cocinar  a fuego rapido"));
        listaDeRecetas.add(new Receta("Ensalada rusa Heman", R.drawable.heman, "carne de heman,azucar,agua,leche, lechuga", "cocinar a fuego lento"));
        listaDeRecetas.add(new Receta("Higado encebollado al estilo Higuain", R.drawable.higuain, "carne precongelada,azucar,agua,cebollas,higado", "cocinar a baja temperatura"));
        listaDeRecetas.add(new Receta("Empanadas al estilo Cobarde", R.drawable.cobarde, "perro,azucar,agua,ajo", "cocinar a fuego lento"));
        listaDeRecetas.add(new Receta("Sopa de Dexter", R.drawable.dexter, "carne humana,azucar,agua, especias tropicales, manzanas", "cocinar a fuego semirapido"));
        listaDeRecetas.add(new Receta("Canelones al estilo Goku", R.drawable.goku, "carne de Saiyajin,azucar,agua, 4 esferas del dragon", "cocinar  a fuego rapido"));
        listaDeRecetas.add(new Receta("Ensalada rusa Heman", R.drawable.heman, "carne de heman,azucar,agua,leche, lechuga", "cocinar a fuego lento"));
        listaDeRecetas.add(new Receta("Higado encebollado al estilo Higuain", R.drawable.higuain, "carne precongelada,azucar,agua,cebollas,higado", "cocinar a baja temperatura"));




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