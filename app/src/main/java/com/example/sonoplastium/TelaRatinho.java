package com.example.sonoplastium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Objects;

public class TelaRatinho extends AppCompatActivity {

    ImageView botaovoltar3;
    ImageView botaoratinho1;
    ImageView botaoratinho2;
    ImageView botaoratinho3;
    ImageView botaoratinho4;
    ImageView botaoratinho5;
    ImageView botaoratinho6;
    ImageView botaoratinho7;
    ImageView botaoratinho8;
    ImageView botaoratinho9;
    ImageView botaoratinho10;
    ImageView botaoratinho11;
    ImageView botaoratinho12;
    MediaPlayer Som1ratinho;
    MediaPlayer Som2ratinho;
    MediaPlayer Som3ratinho;
    MediaPlayer Som4ratinho;
    MediaPlayer Som5ratinho;
    MediaPlayer Som6ratinho;
    MediaPlayer Som7ratinho;
    MediaPlayer Som8ratinho;
    MediaPlayer Som9ratinho;
    MediaPlayer Som10ratinho;
    MediaPlayer Som11ratinho;
    MediaPlayer Som12ratinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_ratinho);
        botaovoltar3 = findViewById(R.id.botaovoltar3);
        botaoratinho1 = findViewById(R.id.botaoratinho1);
        botaoratinho2 = findViewById(R.id.botaoratinho2);
        botaoratinho3 = findViewById(R.id.botaoratinho3);
        botaoratinho4 = findViewById(R.id.botaoratinho4);
        botaoratinho5 = findViewById(R.id.botaoratinho5);
        botaoratinho6 = findViewById(R.id.botaoratinho6);
        botaoratinho7 = findViewById(R.id.botaoratinho7);
        botaoratinho8 = findViewById(R.id.botaoratinho8);
        botaoratinho9 = findViewById(R.id.botaoratinho9);
        botaoratinho10 = findViewById(R.id.botaoratinho10);
        botaoratinho11 = findViewById(R.id.botaoratinho11);
        botaoratinho12 = findViewById(R.id.botaoratinho12);


        botaovoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar3.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botaoratinho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho1.startAnimation(animacaobotao);
                Som1ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som1ratinho);
                Som1ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1ratinho.start();
                    }
                });

                Som1ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1ratinho.release();
                        botaoratinho1.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botaoratinho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho2.startAnimation(animacaobotao);
                Som2ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som2ratinho);
                Som2ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2ratinho.start();
                    }
                });

                Som2ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2ratinho.release();
                        botaoratinho2.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botaoratinho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho3.startAnimation(animacaobotao);
                Som3ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som3ratinho);
                Som3ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3ratinho.start();
                    }
                });

                Som3ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3ratinho.release();
                        botaoratinho3.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botaoratinho4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho4.startAnimation(animacaobotao);
                Som4ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som4ratinho);
                Som4ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4ratinho.start();
                    }
                });

                Som4ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4ratinho.release();
                        botaoratinho4.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botaoratinho5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho5.startAnimation(animacaobotao);
                Som5ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som5ratinho);
                Som5ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5ratinho.start();
                    }
                });

                Som5ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5ratinho.release();
                        botaoratinho5.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botaoratinho6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho6.startAnimation(animacaobotao);
                Som6ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som6ratinho);
                Som6ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6ratinho.start();
                    }
                });

                Som6ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6ratinho.release();
                        botaoratinho6.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botaoratinho7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho7.startAnimation(animacaobotao);
                Som7ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som7ratinho);
                Som7ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7ratinho.start();
                    }
                });

                Som7ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7ratinho.release();
                        botaoratinho7.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botaoratinho8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho8.startAnimation(animacaobotao);
                Som8ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som8ratinho);
                Som8ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8ratinho.start();
                    }
                });

                Som8ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8ratinho.release();
                        botaoratinho8.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botaoratinho9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho9.startAnimation(animacaobotao);
                Som9ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som9ratinho);
                Som9ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9ratinho.start();
                    }
                });

                Som9ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9ratinho.release();
                        botaoratinho9.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botaoratinho10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho10.startAnimation(animacaobotao);
                Som10ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som10ratinho);
                Som10ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10ratinho.start();
                    }
                });

                Som10ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10ratinho.release();
                        botaoratinho10.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botaoratinho11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho11.startAnimation(animacaobotao);
                Som11ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som11ratinho);
                Som11ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11ratinho.start();
                    }
                });

                Som11ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11ratinho.release();
                        botaoratinho11.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botaoratinho12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoratinho12.startAnimation(animacaobotao);
                Som12ratinho = MediaPlayer.create(TelaRatinho.this,R.raw.som12ratinho);
                Som12ratinho.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12ratinho.start();
                    }
                });

                Som12ratinho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12ratinho.release();
                        botaoratinho12.clearAnimation();
                    }
                });

            }
        });
    }
}