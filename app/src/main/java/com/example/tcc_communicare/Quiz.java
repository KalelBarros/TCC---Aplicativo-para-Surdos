package com.example.tcc_communicare;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tcc_communicare.Classes.Pergunta;

public class Quiz extends AppCompatActivity
{
    Pergunta p1 = new Pergunta("Qual o número que corresponde este sinal?","4","5","6","3","4", R.drawable.img_4);
    Pergunta p2 = new Pergunta("Qual o número que corresponde este sinal?","9","6","8","3","6",R.drawable.img_6);
    Pergunta p3 = new Pergunta("Qual a número que corresponde este sinal?","5","3","8","7","7", R.drawable.img_7);


    Pergunta p4 = new Pergunta("Qual a letra que corresponde este sinal?","A","C","G","Y","C", R.drawable.img_c);
    Pergunta p5 = new Pergunta("Qual a letra que corresponde este sinal?","M","A","T","E","T",R.drawable.img_t);
    Pergunta p6 = new Pergunta("Qual a letra que corresponde este sinal?","G","H","Q","D","G",R.drawable.img_g);

    Pergunta p7 = new Pergunta("Qual o significado desta palavra:","Lima","Luva","Liso","Luis","Luis",R.drawable.luis);
    Pergunta p8 = new Pergunta("Qual o significado desta palavra:","Alvo","Tour","Nome","Nova","Nova",R.drawable.nova);
    Pergunta p9 = new Pergunta("Qual o significado desta palavra:","Peixe","Tempo","Amigo","Saber","Tempo",R.drawable.tempo);

    Pergunta p10 = new Pergunta("Qual o significado desta frase:","Gosto de aprender","Amigo de respeito","Festa em Salvador","Gesto de gratidão","Gosto de aprender",R.drawable.gosto_de_aprender);

    Pergunta[] lista_perguntas = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

    TextView texto_questao, texto_numero_questao;
    ImageView image_questao;
    Button bt_resposta1, bt_resposta2, bt_resposta3, bt_resposta4, bt_proximo;
    Button[] lista_botoes;

    boolean isSelecionado = false;

    Button respostaCerta;
    boolean respostaCertaIsSelected;

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        texto_questao = findViewById(R.id.txt_pergunta);
        image_questao = findViewById(R.id.img);
        texto_numero_questao = findViewById(R.id.txt_numero_questao);
        bt_resposta1 = findViewById(R.id.bt_resposta1);
        bt_resposta2 = findViewById(R.id.bt_resposta2);
        bt_resposta3 = findViewById(R.id.bt_resposta3);
        bt_resposta4 = findViewById(R.id.bt_resposta4);
        bt_proximo = findViewById(R.id.bt_proximo);
        lista_botoes = new Button[]{bt_resposta1, bt_resposta2, bt_resposta3, bt_resposta4};

        definirQuestao(i);
    }


    public void definirQuestao(int i)
    {
        texto_questao.setText(lista_perguntas[i].getPergunta());
        image_questao.setBackgroundResource(lista_perguntas[i].getImagem());
        texto_numero_questao.setText(i + 1 + "/" + lista_perguntas.length);
        bt_resposta1.setText(lista_perguntas[i].getOpcao1());
        bt_resposta2.setText(lista_perguntas[i].getOpcao2());
        bt_resposta3.setText(lista_perguntas[i].getOpcao3());
        bt_resposta4.setText(lista_perguntas[i].getOpcao4());
    }

    public void opcaoSelecionada(View view)
    {
        isSelecionado = true;

        for (Button botao : lista_botoes)
        {
            if (view.getId() == botao.getId())
            {
                if(botao.getText() == lista_perguntas[i].getRespostaCerta())
                {
                    respostaCerta = botao;
                    respostaCertaIsSelected = true;
                }
                else
                {
                    respostaCerta = botao;
                    respostaCertaIsSelected = false;
                }
                botao.setBackgroundColor(0xFF3A589A);
            } else
            {
                botao.setBackgroundColor(0xFFFFFFFF);
            }
        }

    }

    public void Proximo(View v)
    {
        if (isSelecionado)
        {
            isSelecionado = false;
            if(respostaCertaIsSelected)
            {
                for(Button botao : lista_botoes)
                {
                    if(respostaCerta == botao)
                    {
                        botao.setBackgroundColor(Color.GREEN);
                    }
                }
            }
            else
            {
                for(Button botao : lista_botoes)
                {
                    if(botao.getText().equals(lista_perguntas[i].getRespostaCerta()))
                    {
                        botao.setBackgroundColor(Color.GREEN);
                    }

                    if(respostaCerta == botao)
                    {
                        botao.setBackgroundColor(Color.RED);
                    }
                }
            }

             new Handler(Looper.getMainLooper()).postDelayed(new Runnable()
             {
                 @Override
                 public void run()
                 {

                     i++;

                     if(i > lista_perguntas.length-1)
                     {
                         Intent i = new Intent(Quiz.this, Menu_quiz.class);
                         startActivity(i);
                         finish();
                     }
                     else
                     {
                         definirQuestao(i);
                         isSelecionado = false;
                         for (Button botao : lista_botoes)
                         {
                             botao.setBackgroundColor(0xFFFFFFFF);
                         }
                     }
                 }
             }, 1200);
         }
    }

}