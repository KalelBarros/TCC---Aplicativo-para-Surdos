package com.example.tcc_communicare.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc_communicare.R;

public class AtividadesFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_atividades, container, false);

        /* Criar os métodos aqui */

        return view; /* Para interagir com o fragmento utiliza a viriavel
        view  e ele precisa retorna o view*/
    }

    public static AtividadesFragment newInstance(){
        return new AtividadesFragment();
    }

}