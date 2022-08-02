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

import sonoplastium.sonoplastium.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Objects;

public class TelaLuvaDePedreiro extends AppCompatActivity {

    ImageView botaovoltar6;
    ImageView botao1luva;
    ImageView botao2luva;
    ImageView botao3luva;
    ImageView botao4luva;
    ImageView botao5luva;
    ImageView botao6luva;
    ImageView botao7luva;
    ImageView botao8luva;
    ImageView botao9luva;
    ImageView botao10luva;
    ImageView botao11luva;
    ImageView botao12luva;

    MediaPlayer Som1luva;
    MediaPlayer Som2luva;
    MediaPlayer Som3luva;
    MediaPlayer Som4luva;
    MediaPlayer Som5luva;
    MediaPlayer Som6luva;
    MediaPlayer Som7luva;
    MediaPlayer Som8luva;
    MediaPlayer Som9luva;
    MediaPlayer Som10luva;
    MediaPlayer Som11luva;
    MediaPlayer Som12luva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_luva_de_pedreiro);
        botaovoltar6 = findViewById(R.id.botaovoltar6);
        botao1luva = findViewById(R.id.botaoluva1);
        botao2luva = findViewById(R.id.botaoluva2);
        botao3luva = findViewById(R.id.botaoluva3);
        botao4luva = findViewById(R.id.botaoluva4);
        botao5luva = findViewById(R.id.botaoluva5);
        botao6luva = findViewById(R.id.botaoluva6);
        botao7luva = findViewById(R.id.botaoluva7);
        botao8luva = findViewById(R.id.botaoluva8);
        botao9luva = findViewById(R.id.botaoluva9);
        botao10luva = findViewById(R.id.botaoluva10);
        botao11luva = findViewById(R.id.botaoluva11);
        botao12luva = findViewById(R.id.botaoluva12);



        botaovoltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar6.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botao1luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao1luva.startAnimation(animacaobotao);
                Som1luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som1luva);
                Som1luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1luva.start();
                    }
                });

                Som1luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1luva.release();
                        botao1luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botao2luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao2luva.startAnimation(animacaobotao);
                Som2luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som2luva);
                Som2luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2luva.start();
                    }
                });

                Som2luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2luva.release();
                        botao2luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botao3luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao3luva.startAnimation(animacaobotao);
                Som3luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som3luva);
                Som3luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3luva.start();
                    }
                });

                Som3luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3luva.release();
                        botao3luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botao4luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao4luva.startAnimation(animacaobotao);
                Som4luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som4luva);
                Som4luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4luva.start();
                    }
                });

                Som4luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4luva.release();
                        botao4luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botao5luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao5luva.startAnimation(animacaobotao);
                Som5luva= MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som5luva);
                Som5luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5luva.start();
                    }
                });

                Som5luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5luva.release();
                        botao5luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botao6luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao6luva.startAnimation(animacaobotao);
                Som6luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som6luva);
                Som6luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6luva.start();
                    }
                });

                Som6luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6luva.release();
                        botao6luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botao7luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao7luva.startAnimation(animacaobotao);
                Som7luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som7luva);
                Som7luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7luva.start();
                    }
                });

                Som7luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7luva.release();
                        botao7luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botao8luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao8luva.startAnimation(animacaobotao);
                Som8luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som8luva);
                Som8luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8luva.start();
                    }
                });

                Som8luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8luva.release();
                        botao8luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botao9luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao9luva.startAnimation(animacaobotao);
                Som9luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som9luva);
                Som9luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9luva.start();
                    }
                });

                Som9luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9luva.release();
                        botao9luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botao10luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao10luva.startAnimation(animacaobotao);
                Som10luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som10luva);
                Som10luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10luva.start();
                    }
                });

                Som10luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10luva.release();
                        botao10luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botao11luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao11luva.startAnimation(animacaobotao);
                Som11luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som11luva);
                Som11luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11luva.start();
                    }
                });

                Som11luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11luva.release();
                        botao11luva.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botao12luva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao12luva.startAnimation(animacaobotao);
                Som12luva = MediaPlayer.create(TelaLuvaDePedreiro.this,R.raw.som12luva);
                Som12luva.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12luva.start();
                    }
                });

                Som12luva.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12luva.release();
                        botao12luva.clearAnimation();
                    }
                });

            }
        });

    }
}