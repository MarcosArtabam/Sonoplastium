package com.sonoplastium.sonoplastium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Objects;

import sonoplastium.sonoplastium.R;

public class TelaCaze extends AppCompatActivity {

    ImageView botaovoltar5;
    ImageView botao1caze;
    ImageView botao2caze;
    ImageView botao3caze;
    ImageView botao4caze;
    ImageView botao5caze;
    ImageView botao6caze;
    ImageView botao7caze;
    ImageView botao8caze;
    ImageView botao9caze;
    ImageView botao10caze;
    ImageView botao11caze;
    ImageView botao12caze;

    MediaPlayer Som1caze;
    MediaPlayer Som2caze;
    MediaPlayer Som3caze;
    MediaPlayer Som4caze;
    MediaPlayer Som5caze;
    MediaPlayer Som6caze;
    MediaPlayer Som7caze;
    MediaPlayer Som8caze;
    MediaPlayer Som9caze;
    MediaPlayer Som10caze;
    MediaPlayer Som11caze;
    MediaPlayer Som12caze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_caze);
        botaovoltar5 = findViewById(R.id.botaovoltar5);
        botao1caze = findViewById(R.id.botaocaze1);
        botao2caze = findViewById(R.id.botaocaze2);
        botao3caze = findViewById(R.id.botaocaze3);
        botao4caze = findViewById(R.id.botaocaze4);
        botao5caze = findViewById(R.id.botaocaze5);
        botao6caze = findViewById(R.id.botaocaze6);
        botao7caze = findViewById(R.id.botaocaze7);
        botao8caze = findViewById(R.id.botaocaze8);
        botao9caze = findViewById(R.id.botaocaze9);
        botao10caze = findViewById(R.id.botaocaze10);
        botao11caze = findViewById(R.id.botaocaze11);
        botao12caze = findViewById(R.id.botaocaze12);


        botaovoltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar5.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botao1caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao1caze.startAnimation(animacaobotao);
                Som1caze = MediaPlayer.create(TelaCaze.this,R.raw.som1caze);
                Som1caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1caze.start();
                    }
                });

                Som1caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1caze.release();
                        botao1caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botao2caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao2caze.startAnimation(animacaobotao);
                Som2caze = MediaPlayer.create(TelaCaze.this,R.raw.som2caze);
                Som2caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2caze.start();
                    }
                });

                Som2caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2caze.release();
                        botao2caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botao3caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao3caze.startAnimation(animacaobotao);
                Som3caze = MediaPlayer.create(TelaCaze.this,R.raw.som3caze);
                Som3caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3caze.start();
                    }
                });

                Som3caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3caze.release();
                        botao3caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botao4caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao4caze.startAnimation(animacaobotao);
                Som4caze = MediaPlayer.create(TelaCaze.this,R.raw.som4caze);
                Som4caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4caze.start();
                    }
                });

                Som4caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4caze.release();
                        botao4caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botao5caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao5caze.startAnimation(animacaobotao);
                Som5caze= MediaPlayer.create(TelaCaze.this,R.raw.som5caze);
                Som5caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5caze.start();
                    }
                });

                Som5caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5caze.release();
                        botao5caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botao6caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao6caze.startAnimation(animacaobotao);
                Som6caze = MediaPlayer.create(TelaCaze.this,R.raw.som6caze);
                Som6caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6caze.start();
                    }
                });

                Som6caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6caze.release();
                        botao6caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botao7caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao7caze.startAnimation(animacaobotao);
                Som7caze = MediaPlayer.create(TelaCaze.this,R.raw.som7caze);
                Som7caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7caze.start();
                    }
                });

                Som7caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7caze.release();
                        botao7caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botao8caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao8caze.startAnimation(animacaobotao);
                Som8caze = MediaPlayer.create(TelaCaze.this,R.raw.som8caze);
                Som8caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8caze.start();
                    }
                });

                Som8caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8caze.release();
                        botao8caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botao9caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao9caze.startAnimation(animacaobotao);
                Som9caze = MediaPlayer.create(TelaCaze.this,R.raw.som9caze);
                Som9caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9caze.start();
                    }
                });

                Som9caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9caze.release();
                        botao9caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botao10caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao10caze.startAnimation(animacaobotao);
                Som10caze = MediaPlayer.create(TelaCaze.this,R.raw.som10caze);
                Som10caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10caze.start();
                    }
                });

                Som10caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10caze.release();
                        botao10caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botao11caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao11caze.startAnimation(animacaobotao);
                Som11caze = MediaPlayer.create(TelaCaze.this,R.raw.som11caze);
                Som11caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11caze.start();
                    }
                });

                Som11caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11caze.release();
                        botao11caze.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botao12caze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao12caze.startAnimation(animacaobotao);
                Som12caze = MediaPlayer.create(TelaCaze.this,R.raw.som12caze);
                Som12caze.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12caze.start();
                    }
                });

                Som12caze.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12caze.release();
                        botao12caze.clearAnimation();
                    }
                });

            }
        });



    }
}