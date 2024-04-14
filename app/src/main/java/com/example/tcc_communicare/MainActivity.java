package com.example.tcc_communicare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.tcc_communicare.fragments.AtividadesFragment;
import com.example.tcc_communicare.fragments.EmergenciaFragment;
import com.example.tcc_communicare.fragments.TecladoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private TecladoFragment fragmentTec;
    private AtividadesFragment fragmentAtv;
    private EmergenciaFragment fragmentEmerg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnItemSelectedListener(this);

        fragmentTec = new  TecladoFragment();
        fragmentAtv = new AtividadesFragment();
        fragmentEmerg = new EmergenciaFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragmentTec).commit();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.botao_teclado) {
            selectedFragment = fragmentTec;
        } else if (itemId == R.id.botao_atividades) {
            selectedFragment = fragmentAtv;
        } else if (itemId == R.id.botao_emergencia) {
            selectedFragment = fragmentEmerg;
        }

        if(selectedFragment != null){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, selectedFragment).commit();
    }

      return true;
    }
}