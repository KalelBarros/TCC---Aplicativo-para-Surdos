package com.example.tcc_communicare.Classes;

import android.graphics.drawable.Drawable;

public class Pergunta
{
    private String Pergunta, opcao1, opcao2, opcao3, opcao4, respostaCerta;
    int imagem;

    public Pergunta(String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String respostaCerta, int imagem)
    {
        Pergunta = pergunta;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.respostaCerta = respostaCerta;
        this.imagem = imagem;
    }

    public String getPergunta() {
        return Pergunta;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public String getOpcao3() {
        return opcao3;
    }

    public String getOpcao4() {
        return opcao4;
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }

    public int getImagem(){return imagem;}
}
