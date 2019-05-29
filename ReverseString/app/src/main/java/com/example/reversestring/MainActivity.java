package com.example.reversestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button button1;

    EditText et_entrada;

    TextView tv_saida;

    HashMap<Character, Integer> charCountMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_ReverseString);
        et_entrada = (EditText) findViewById(R.id.et_entrada);
        tv_saida = (TextView) findViewById(R.id.tv_saida);

        charCountMap = new HashMap<>();

        findViewById(R.id.btn_ReverseString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_entrada.getText().toString().isEmpty()) {
                    StringBuffer c = new StringBuffer(et_entrada.getText().toString());
                    tv_saida.setText(c.reverse());
                } else {
                    et_entrada.setError("Enter NAME");
                }
            }
        });


    }

}