package com.example.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "Acredite em si mesmo e tudo será possível.",
            "Quanto maior o obstáculo, mais glória em superá-lo.",
            "Não espere por oportunidades, crie-as.",
            "O caminho para o sucesso é sempre em frente.",
            "A persistência é o segredo do êxito.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(frases.length);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);

    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";
        for (String frase: frases) {
            textoResultado += frase + "\n" + "\n";
        }
        texto.setText(textoResultado);
    }
}