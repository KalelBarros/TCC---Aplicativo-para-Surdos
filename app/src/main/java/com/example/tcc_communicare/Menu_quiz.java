package com.example.tcc_communicare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu_quiz extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);
    }

    public void MenuBtn(View v)
    {
        Intent i = new Intent(Menu_quiz.this, Quiz.class);
        startActivity(i);
        finish();
    }

    public void Sair(View v)
    {
        Intent i = new Intent(Menu_quiz.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}