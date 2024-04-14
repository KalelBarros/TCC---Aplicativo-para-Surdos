package com.example.tcc_communicare.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tcc_communicare.MainActivity;
import com.example.tcc_communicare.R;

import java.util.Locale;

public class TecladoFragment extends Fragment {

   /* Definindo as variàveis */
    private Context context;
    private TextView resultTextView;
    private Button backspace;
    private Button virgula;
    private Button ponto;
    private Button espaco;
    private Object view;
    private EditText caixa_texto;
    boolean maiusculo = false;
    private Button
            converte;
    private TextToSpeech textToSpeech;

    /* Método do fragmento */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_teclado, container, false);

        /* Localização dos itens utilizados no Teclado
         Para fazer a vinculação no fragmento, tem que usar o viewfindViewById */
        resultTextView = view.findViewById(R.id.txt_resultado);
        caixa_texto = view.findViewById(R.id.caixa_texto);
        converte = view.findViewById(R.id.bt_converter);

        /* Números do Teclado */
        ImageView numero_1 = view.findViewById(R.id.bt_1);
        ImageView numero_2 = view.findViewById(R.id.bt_2);
        ImageView numero_3 = view.findViewById(R.id.bt_3);
        ImageView numero_4 = view.findViewById(R.id.bt_4);
        ImageView numero_5 = view.findViewById(R.id.bt_5);
        ImageView numero_6 = view.findViewById(R.id.bt_6);
        ImageView numero_7 = view.findViewById(R.id.bt_7);
        ImageView numero_8 = view.findViewById(R.id.bt_8);
        ImageView numero_9 = view.findViewById(R.id.bt_9);
        ImageView numero_0 = view.findViewById(R.id.bt_0);

        /* Letras do Teclado */
        ImageView letra_Q = view.findViewById(R.id.letra_q);
        ImageView letra_W = view.findViewById(R.id.letra_w);
        ImageView letra_E = view.findViewById(R.id.letra_e);
        ImageView letra_R = view.findViewById(R.id.letra_r);
        ImageView letra_T = view.findViewById(R.id.letra_t);
        ImageView letra_Y = view.findViewById(R.id.letra_y);
        ImageView letra_U = view.findViewById(R.id.letra_u);
        ImageView letra_I = view.findViewById(R.id.letra_i);
        ImageView letra_O = view.findViewById(R.id.letra_o);
        ImageView letra_P = view.findViewById(R.id.letra_p);
        ImageView letra_A = view.findViewById(R.id.letra_a);
        ImageView letra_S = view.findViewById(R.id.letra_s);
        ImageView letra_D = view.findViewById(R.id.letra_d);
        ImageView letra_F = view.findViewById(R.id.letra_f);
        ImageView letra_G = view.findViewById(R.id.letra_g);
        ImageView letra_H = view.findViewById(R.id.letra_h);
        ImageView letra_J = view.findViewById(R.id.letra_j);
        ImageView letra_K = view.findViewById(R.id.letra_k);
        ImageView letra_L = view.findViewById(R.id.letra_l);
        ImageView letra_Z = view.findViewById(R.id.letra_z);
        ImageView letra_X = view.findViewById(R.id.letra_x);
        ImageView letra_C = view.findViewById(R.id.letra_c);
        ImageView letra_V = view.findViewById(R.id.letra_v);
        ImageView letra_B = view.findViewById(R.id.letra_b);
        ImageView letra_N = view.findViewById(R.id.letra_n);
        ImageView letra_M = view.findViewById(R.id.letra_m);

        /* Sinais do Teclado */
        Button backspace = view.findViewById(R.id.backspace);
        Button virgula = view.findViewById(R.id.virgula);
        Button ponto = view.findViewById(R.id.bt_ponto);
        Button espaco = view.findViewById(R.id.bt_espaco);
        ImageView letra_maiuscula = view.findViewById(R.id.letra_maiuscula);

        /* Métodos para a saida das letras, números e sinais */
        numero_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("1");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });


        numero_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("2");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("3");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("4");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("5");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("6");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("7");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("8");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("9");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        numero_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SetResultText("0");
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("Q");
                } else {
                    SetResultText("q");
                }
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("W");
                } else {
                    SetResultText("w");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("E");
                } else {
                    SetResultText("e");
                }
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("R");
                } else {
                    SetResultText("r");
                }
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("T");
                } else {
                    SetResultText("t");
                }
            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("Y");
                } else {
                    SetResultText("y");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("U");
                } else {
                    SetResultText("u");

                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("I");
                } else {
                    SetResultText("i");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {

                    SetResultText("O");
                } else {
                    SetResultText("o");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("P");
                } else {
                    SetResultText("p");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("A");
                } else {
                    SetResultText("a");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("S");
                } else {
                    SetResultText("s");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("D");
                } else {
                    SetResultText("d");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("F");
                } else {
                    SetResultText("f");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("G");
                } else {
                    SetResultText("g");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("H");
                } else {
                    SetResultText("h");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("J");
                } else {
                    SetResultText("j");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("K");
                } else {
                    SetResultText("k");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("L");
                } else {
                    SetResultText("l");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("Z");
                } else {
                    SetResultText("z");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("X");
                } else {
                    SetResultText("x");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("C");
                } else {
                    SetResultText("c");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("V");
                } else {
                    SetResultText("v");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("B");
                } else {
                    SetResultText("b");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("N");
                } else {
                    SetResultText("n");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        letra_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (maiusculo) {
                    SetResultText("M");
                } else {
                    SetResultText("m");
                }

            }

            private void SetResultText(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }
        });

        espaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                espacamento(" ");
            }

            private void espacamento(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();
            }

        });

        virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colocaVirgula(",");
            }

            private void colocaVirgula(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();

            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                colocaPonto(".");
            }

            private void colocaPonto(String letter) {
                resultTextView.append(letter);
                caixa_texto.append(letter);
                caixa_texto.getText();
                resultTextView.getText();

            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = view.findViewById(R.id.txt_resultado);
                String string = result.getText().toString();

                EditText caixa = view.findViewById(R.id.caixa_texto);
                String stringCaixa = caixa.getText().toString();

                if (!string.isEmpty() && !stringCaixa.isEmpty()) {

                    byte var0 = 0; /* Variavel do tipo byte pra na cracchar o app*/
                    int var1 = string.length() - 1;
                    int varCaixa = stringCaixa.length() - 1;

                    String displayTextView = string.substring(var0, var1);
                    result.setText(displayTextView);
                    String digiteEditText = stringCaixa.substring(var0, varCaixa);
                    caixa.setText(digiteEditText);
                }
            }

        });

        letra_maiuscula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (maiusculo == true) {
                    maiusculo = false;
                } else {
                    maiusculo = true;
                }
            }
        });

        /* Conversão das palavras para áudio */

        textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // Configura a língua do TextToSpeech
                    textToSpeech.setLanguage(Locale.getDefault());
                } else {
                    Toast.makeText(getActivity(), "Erro na inicialização do TextToSpeech!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtém o texto da EditText
                String text = caixa_texto.getText().toString();
                if (!text.isEmpty()) {
                    // Converte o texto em áudio
                    textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        return view;
    }

  @Override
    public void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
 }

    public static TecladoFragment newInstance(){
        return new TecladoFragment();
    }

}