package com.example.countvowels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button button1;

    EditText et_entrada;

    TextView txtview1, txtview2, txtview3;

    String str;

    int vowels = 0;
    int consonants = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_contavogais);
        et_entrada = (EditText) findViewById(R.id.et_entrada);
        txtview1 = (TextView) findViewById(R.id.txtv_saida_vogais);
        txtview2 = (TextView) findViewById(R.id.txtv_digitos);


        findViewById(R.id.btn_contavogais).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!et_entrada.getText().toString().isEmpty()) {


                    str = et_entrada.getText().toString().toLowerCase();

                    char [] charArray = str.toCharArray();

                    for (char c: charArray) {

                        if(Pattern.matches("[aeiou]", Character.toString(c))) {
                            vowels++;

                        } else {
                            consonants++;
                        }

                    }


                    txtview1.setText(String.valueOf(vowels));
                    txtview2.setText(String.valueOf(consonants));




                } else {
                    et_entrada.setError("Eita porra!!!");
                }



            }
        });


    }

}
