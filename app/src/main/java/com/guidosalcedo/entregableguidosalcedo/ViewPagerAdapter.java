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

    // revisar

    public ViewPagerAdapter(FragmentManager fm, List<Receta>listaRecetas) {
        super(fm);
        for (Receta unaReceta:listaRecetas) {

            fragmentos.add(RecetaDetalleFragment.crearFragmentoDetalle(fragmentos.indexOf(unaReceta)));

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
