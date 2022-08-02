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

public class TelaOtaku extends AppCompatActivity {

    ImageView botaovoltar4;
    ImageView botaootaku1;
    ImageView botaootaku2;
    ImageView botaootaku3;
    ImageView botaootaku4;
    ImageView botaootaku5;
    ImageView botaootaku6;
    ImageView botaootaku7;
    ImageView botaootaku8;
    ImageView botaootaku9;
    ImageView botaootaku10;
    ImageView botaootaku11;
    ImageView botaootaku12;

    MediaPlayer Som1otaku;
    MediaPlayer Som2otaku;
    MediaPlayer Som3otaku;
    MediaPlayer Som4otaku;
    MediaPlayer Som5otaku;
    MediaPlayer Som6otaku;
    MediaPlayer Som7otaku;
    MediaPlayer Som8otaku;
    MediaPlayer Som9otaku;
    MediaPlayer Som10otaku;
    MediaPlayer Som11otaku;
    MediaPlayer Som12otaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_otaku);
        botaovoltar4 = findViewById(R.id.botaovoltar4);
        botaootaku1 = findViewById(R.id.botaootaku1);
        botaootaku2 = findViewById(R.id.botaootaku2);
        botaootaku3 = findViewById(R.id.botaootaku3);
        botaootaku4 = findViewById(R.id.botaootaku4);
        botaootaku5 = findViewById(R.id.botaootaku5);
        botaootaku6 = findViewById(R.id.botaootaku6);
        botaootaku7 = findViewById(R.id.botaootaku7);
        botaootaku8 = findViewById(R.id.botaootaku8);
        botaootaku9 = findViewById(R.id.botaootaku9);
        botaootaku10 = findViewById(R.id.botaootaku10);
        botaootaku11 = findViewById(R.id.botaootaku11);
        botaootaku12 = findViewById(R.id.botaootaku12);



        botaovoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar4.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botaootaku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku1.startAnimation(animacaobotao);
                Som1otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som1otaku);
                Som1otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1otaku.start();
                    }
                });

                Som1otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1otaku.release();
                        botaootaku1.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botaootaku2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku2.startAnimation(animacaobotao);
                Som2otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som2otaku);
                Som2otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2otaku.start();
                    }
                });

                Som2otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2otaku.release();
                        botaootaku2.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botaootaku3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku3.startAnimation(animacaobotao);
                Som3otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som3otaku);
                Som3otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3otaku.start();
                    }
                });

                Som3otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3otaku.release();
                        botaootaku3.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botaootaku4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku4.startAnimation(animacaobotao);
                Som4otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som4otaku);
                Som4otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4otaku.start();
                    }
                });

                Som4otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4otaku.release();
                        botaootaku4.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botaootaku5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku5.startAnimation(animacaobotao);
                Som5otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som5otaku);
                Som5otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5otaku.start();
                    }
                });

                Som5otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5otaku.release();
                        botaootaku5.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botaootaku6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku6.startAnimation(animacaobotao);
                Som6otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som6otaku);
                Som6otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6otaku.start();
                    }
                });

                Som6otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6otaku.release();
                        botaootaku6.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botaootaku7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku7.startAnimation(animacaobotao);
                Som7otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som7otaku);
                Som7otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7otaku.start();
                    }
                });

                Som7otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7otaku.release();
                        botaootaku7.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botaootaku8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku8.startAnimation(animacaobotao);
                Som8otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som8otaku);
                Som8otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8otaku.start();
                    }
                });

                Som8otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8otaku.release();
                        botaootaku8.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botaootaku9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku9.startAnimation(animacaobotao);
                Som9otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som9otaku);
                Som9otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9otaku.start();
                    }
                });

                Som9otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9otaku.release();
                        botaootaku9.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botaootaku10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku10.startAnimation(animacaobotao);
                Som10otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som10otaku);
                Som10otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10otaku.start();
                    }
                });

                Som10otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10otaku.release();
                        botaootaku10.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botaootaku11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku11.startAnimation(animacaobotao);
                Som11otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som11otaku);
                Som11otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11otaku.start();
                    }
                });

                Som11otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11otaku.release();
                        botaootaku11.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botaootaku12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaootaku12.startAnimation(animacaobotao);
                Som12otaku = MediaPlayer.create(TelaOtaku.this,R.raw.som12otaku);
                Som12otaku.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12otaku.start();
                    }
                });

                Som12otaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12otaku.release();
                        botaootaku12.clearAnimation();
                    }
                });

            }
        });
    }
}