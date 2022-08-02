package com.sonoplastium.sonoplastium;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import sonoplastium.sonoplastium.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Objects;

public class TelaMenu extends AppCompatActivity {
    ImageView botaocaze;
    ImageView botaovaidarnamoro;
    ImageView botaoratinho;
    ImageView botaodefante;
    ImageView botaoluvadep;
    ImageView botaootaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_menu);


        botaocaze = findViewById(R.id.botaocaze);
        botaovaidarnamoro = findViewById(R.id.botaovaidarnamoro);
        botaoratinho = findViewById(R.id.botaoratinho);
        botaodefante = findViewById(R.id.botaodefante);
        botaootaku = findViewById(R.id.botaootaku);
        botaoluvadep = findViewById(R.id.botaoluvadep);



        botaocaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaocaze.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaCaze.class);
                startActivity(intent);
            }
        });

        botaovaidarnamoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaovaidarnamoro.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaVaiDarNamoro.class);
                startActivity(intent);
            }
        });

        botaootaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaootaku.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaOtaku.class);
                startActivity(intent);
            }
        });

        botaoratinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaoratinho.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaRatinho.class);
                startActivity(intent);
            }
        });

        botaoluvadep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaoluvadep.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaLuvaDePedreiro.class);
                startActivity(intent);
            }
        });

        botaodefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright);
                botaodefante.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaDefante.class);
                startActivity(intent);
            }
        });

    }
}


