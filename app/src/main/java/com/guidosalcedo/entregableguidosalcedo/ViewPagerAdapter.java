package com.guidosalcedo.entregableguidosalcedo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.guidosalcedo.entregableguidosalcedo.Datos.Receta;
import com.guidosalcedo.entregableguidosalcedo.Fragments.RecetaDetalleFragment;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentos = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, List<Receta>listaRecetas,Integer posicion) {
        super(fm);

        fragmentos.add(RecetaDetalleFragment.crearFragmentoDetalle(posicion));

        for (Receta unaReceta:listaRecetas) {

            if(posicion != (listaRecetas.indexOf(unaReceta))){

                fragmentos.add(RecetaDetalleFragment.crearFragmentoDetalle(listaRecetas.indexOf(unaReceta)));
            }
        }
    }
    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);
    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }



}
