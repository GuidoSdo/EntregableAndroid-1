package com.guidosalcedo.entregableguidosalcedo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.guidosalcedo.entregableguidosalcedo.Datos.DataProvider;
import com.guidosalcedo.entregableguidosalcedo.Fragments.RecetaDetalleFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        DataProvider dataProvider = new DataProvider();

        viewPagerAdapter = new ViewPagerAdapter(fragmentManager,dataProvider.getListaRecetas(),unBundle.getInt("posicion"));
        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(viewPagerAdapter);
    }
}
