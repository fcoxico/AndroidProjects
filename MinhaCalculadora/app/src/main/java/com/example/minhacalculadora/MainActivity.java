package com.example.minhacalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaração de todos os botões da calculadora.
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_par_left;
    Button button_par_right;
    Button button_percent;
    Button button_apaga;
    Button button_divide;
    Button button_mult;
    Button button_sub;
    Button button_soma;
    Button button_virgula;
    Button button_igual;


    EditText tela;

    float valueOne, valueTwo;

    boolean fSoma, fDiminui, fMultiplica, fDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botões de Zero a 9
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);


        //Botões das funções matemáticas
        Button button_divide = (Button) findViewById(R.id.button_divide);
        Button button_mult = (Button) findViewById(R.id.button_mult);
        Button button_sub = (Button) findViewById(R.id.button_sub);
        Button button_soma = (Button) findViewById(R.id.button_soma);

        //Botões das elementos da calculadora
        Button button_par_left = (Button) findViewById(R.id.button_par_left);
        Button button_par_right = (Button) findViewById(R.id.button_par_right);
        Button button_percent = (Button) findViewById(R.id.button_percent);
        Button button_apaga = (Button) findViewById(R.id.button_apaga);
        Button button_virgula = (Button) findViewById(R.id.button_virgula);
        Button button_igual = (Button) findViewById(R.id.button_igual);



        //Implementando os métodos
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "9");
            }
        });


        button_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tela == null) {
                    tela.setText("");
                } else {
                    valueOne = Float.parseFloat(tela.getText() + "");
                    fSoma = true;
                    tela.setText(null);
                }
            }
        });


        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(tela.getText() + "");
                fDiminui = true;
                tela.setText(null);
            }
        });

        button_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(tela.getText() + "");
                fMultiplica = true;
                tela.setText(null);
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(tela.getText() + "");
                fDivide = true;
                tela.setText(null);
            }
        });

        button_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(tela.getText() + "");

                if (fSoma == true) {
                    tela.setText(valueOne + valueTwo + "");
                    fSoma = false;
                }

                if (fDiminui == true) {
                    tela.setText(valueOne - valueTwo + "");
                    fDiminui = false;
                }

                if (fMultiplica == true) {
                    tela.setText(valueOne * valueTwo + "");
                    fMultiplica = false;
                }

                if (fDivide == true) {
                    tela.setText(valueOne / valueTwo + "");
                    fDivide = false;
                }

            }
        });

        button_apaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText("");
            }
        });

        button_virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + ".");
            }
        });

        button_par_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "(");
            }
        });

        button_par_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + ")");
            }
        });







    }
}
