package com.example.tcc_communicare.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc_communicare.Menu_quiz;
import com.example.tcc_communicare.R;

public class AprendizadoFragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_aprendizado, container, false);

        /* Criar os métodos aqui */
        view.findViewById(R.id.bt_Quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_quiz.class);
                startActivity(intent);
            }
        });

        return view; /* Para interagir com o fragmento utiliza a viriavel
        view  e ele precisa retorna o view*/
    }

    public static AprendizadoFragment newInstance(){
        return new AprendizadoFragment();
    }



}