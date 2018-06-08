package com.guidosalcedo.entregableguidosalcedo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.guidosalcedo.entregableguidosalcedo.Datos.Receta;
import com.guidosalcedo.entregableguidosalcedo.Fragments.AboutUsFragment;
import com.guidosalcedo.entregableguidosalcedo.Fragments.HomeFragment;
import com.guidosalcedo.entregableguidosalcedo.Fragments.RecetaDetalleFragment;
import com.guidosalcedo.entregableguidosalcedo.Fragments.RecetasFragment;
import com.guidosalcedo.entregableguidosalcedo.Fragments.RecetasFragment.ComunicadorFragmentAlActivity;

public class MainActivity extends AppCompatActivity implements ComunicadorFragmentAlActivity {

    // Atributos
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navigation View
        drawerLayout =  findViewById(R.id.drawerLayout);
        navigationView =findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new ListenerMenu());

        // Fragment por defecto del Activity
        HomeFragment homeFragment = new HomeFragment();
        cargarFragment(homeFragment);





    }

    // Navigation View
    private class ListenerMenu implements NavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            selectedMenuItem(item);
            return true;
        }
    }

    // Menu del navigation view
    public void selectedMenuItem(MenuItem item){

        switch (item.getItemId()){
            case R.id.itemRecetas :
                RecetasFragment recetasFragment = new RecetasFragment();
                cargarFragment(recetasFragment);



                break;
            case R.id.itemAboutUs :
                AboutUsFragment aboutUsFragment = new AboutUsFragment();
                cargarFragment(aboutUsFragment);

                break;
           default:
                Toast.makeText(this, "SELECCIONA ALGO", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawers();
    }

    private void cargarFragment(Fragment fragmentACargar){

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragment,fragmentACargar);
        fragmentTransaction.addToBackStack(null).commit();
    }

    // Comunicacion con - RecetaFragment
    @Override
    public void clickEnCelda(Integer posicionRecetaSeleccionada) {

        Intent unIntent = new Intent(this, ViewPagerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("posicion",posicionRecetaSeleccionada);

        unIntent.putExtras(bundle);
        startActivity(unIntent);
    }
}
