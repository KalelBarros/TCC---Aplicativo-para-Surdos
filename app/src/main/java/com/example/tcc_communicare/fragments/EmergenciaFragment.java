package com.example.tcc_communicare.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc_communicare.R;

public class EmergenciaFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_emergencia, container, false);

        /* Criar os métodos aqui */

        return view;
    }

    public static EmergenciaFragment newInstance(){
        return new EmergenciaFragment();
    }

}