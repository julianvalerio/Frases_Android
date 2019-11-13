package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "Não é a força ou a sorte, mas o empenho e a persistência que determinam seu sucesso!",
            "Não sofra antes do tempo, e talvez jamais tenha que sofrer!",
            "Investir em conhecimento rende sempre os melhores juros!",
            "Evitar erros catastróficos é melhor do que construir o portfólio perfeito!",
            "Você não aprende a andar seguindo regras, você aprende fazendo e caindo!",
            "Se você quer ser vencedor, compare-se ao melhor e reconheça que isso nuca acontecerá sem muito trabalho!",
            "É a prática que torna você melhor no que faz!",
            "Quando a dor do próximo não te afeta, quem precisa de ajuda é você!",
            "Qualquer sentimento pode ser um combustível para o seu crescimento ou um caminho para você afudnar!",
            "Todo mundo tem um plano, até levar o primeiro soco na cara!",
            "Não tenha pressa, mas tenha rumo. Demorar é diferente de se perder!",
            "Seus hábitos determinam seu futuro!"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.id_texto);
        botaoNovaFrase = findViewById(R.id.botaoFrase);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numAleatorio]);
            }
        });
    }
}
