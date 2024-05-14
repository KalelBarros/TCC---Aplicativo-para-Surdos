package com.example.tcc_communicare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tcc_communicare.fragments.AprendizadoFragment;
import com.example.tcc_communicare.fragments.EmergenciaFragment;
import com.example.tcc_communicare.fragments.TecladoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private TecladoFragment fragmentTec;
    private AprendizadoFragment fragmentAtv;
    private EmergenciaFragment fragmentEmerg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnItemSelectedListener(this);

        fragmentTec = new  TecladoFragment();
        fragmentAtv = new AprendizadoFragment();
        fragmentEmerg = new EmergenciaFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragmentTec).commit();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.botao_teclado) {
            selectedFragment = fragmentTec;
        } else if (itemId == R.id.botao_aprendizado) {
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