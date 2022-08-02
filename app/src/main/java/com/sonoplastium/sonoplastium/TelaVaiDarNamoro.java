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

public class TelaVaiDarNamoro extends AppCompatActivity {

    ImageView botaovoltar2;
    ImageView botaovaidarnamoro1;
    ImageView botaovaidarnamoro2;
    ImageView botaovaidarnamoro3;
    ImageView botaovaidarnamoro4;
    ImageView botaovaidarnamoro5;
    ImageView botaovaidarnamoro6;
    ImageView botaovaidarnamoro7;
    ImageView botaovaidarnamoro8;
    ImageView botaovaidarnamoro9;
    ImageView botaovaidarnamoro10;
    ImageView botaovaidarnamoro11;
    ImageView botaovaidarnamoro12;
    MediaPlayer Som1vaidarnamoro;
    MediaPlayer Som2vaidarnamoro;
    MediaPlayer Som3vaidarnamoro;
    MediaPlayer Som4vaidarnamoro;
    MediaPlayer Som5vaidarnamoro;
    MediaPlayer Som6vaidarnamoro;
    MediaPlayer Som7vaidarnamoro;
    MediaPlayer Som8vaidarnamoro;
    MediaPlayer Som9vaidarnamoro;
    MediaPlayer Som10vaidarnamoro;
    MediaPlayer Som11vaidarnamoro;
    MediaPlayer Som12vaidarnamoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_vai_dar_namoro);
        botaovoltar2 = findViewById(R.id.botaovoltar2);
        botaovaidarnamoro1 = findViewById(R.id.botaovaidarnamoro1);
        botaovaidarnamoro2 = findViewById(R.id.botaovaidarnamoro2);
        botaovaidarnamoro3 = findViewById(R.id.botaovaidarnamoro3);
        botaovaidarnamoro4 = findViewById(R.id.botaovaidarnamoro4);
        botaovaidarnamoro5 = findViewById(R.id.botaovaidarnamoro5);
        botaovaidarnamoro6 = findViewById(R.id.botaovaidarnamoro6);
        botaovaidarnamoro7 = findViewById(R.id.botaovaidarnamoro7);
        botaovaidarnamoro8 = findViewById(R.id.botaovaidarnamoro8);
        botaovaidarnamoro9 = findViewById(R.id.botaovaidarnamoro9);
        botaovaidarnamoro10 = findViewById(R.id.botaovaidarnamoro10);
        botaovaidarnamoro11 = findViewById(R.id.botaovaidarnamoro11);
        botaovaidarnamoro12 = findViewById(R.id.botaovaidarnamoro12);



        botaovoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar2.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botaovaidarnamoro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro1.startAnimation(animacaobotao);
                Som1vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som1vaidarnamoro);
                Som1vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1vaidarnamoro.start();
                    }
                });

                Som1vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1vaidarnamoro.release();
                        botaovaidarnamoro1.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botaovaidarnamoro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro2.startAnimation(animacaobotao);
                Som2vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som2vaidarnamoro);
                Som2vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2vaidarnamoro.start();
                    }
                });

                Som2vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2vaidarnamoro.release();
                        botaovaidarnamoro2.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botaovaidarnamoro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro3.startAnimation(animacaobotao);
                Som3vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som3vaidarnamoro);
                Som3vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3vaidarnamoro.start();
                    }
                });

                Som3vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3vaidarnamoro.release();
                        botaovaidarnamoro3.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botaovaidarnamoro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro4.startAnimation(animacaobotao);
                Som4vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som4vaidarnamoro);
                Som4vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4vaidarnamoro.start();
                    }
                });

                Som4vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4vaidarnamoro.release();
                        botaovaidarnamoro4.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botaovaidarnamoro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro5.startAnimation(animacaobotao);
                Som5vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som5vaidarnamoro);
                Som5vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5vaidarnamoro.start();
                    }
                });

                Som5vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5vaidarnamoro.release();
                        botaovaidarnamoro5.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botaovaidarnamoro6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro6.startAnimation(animacaobotao);
                Som6vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som6vaidarnamoro);
                Som6vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6vaidarnamoro.start();
                    }
                });

                Som6vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6vaidarnamoro.release();
                        botaovaidarnamoro6.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botaovaidarnamoro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro7.startAnimation(animacaobotao);
                Som7vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som7vaidarnamoro);
                Som7vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7vaidarnamoro.start();
                    }
                });

                Som7vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7vaidarnamoro.release();
                        botaovaidarnamoro7.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botaovaidarnamoro8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro8.startAnimation(animacaobotao);
                Som8vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som8vaidarnamoro);
                Som8vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8vaidarnamoro.start();
                    }
                });

                Som8vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8vaidarnamoro.release();
                        botaovaidarnamoro8.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botaovaidarnamoro9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro9.startAnimation(animacaobotao);
                Som9vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som9vaidarnamoro);
                Som9vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9vaidarnamoro.start();
                    }
                });

                Som9vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9vaidarnamoro.release();
                        botaovaidarnamoro9.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botaovaidarnamoro10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro10.startAnimation(animacaobotao);
                Som10vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som10vaidarnamoro);
                Som10vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10vaidarnamoro.start();
                    }
                });

                Som10vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10vaidarnamoro.release();
                        botaovaidarnamoro10.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botaovaidarnamoro11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro11.startAnimation(animacaobotao);
                Som11vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som11vaidarnamoro);
                Som11vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11vaidarnamoro.start();
                    }
                });

                Som11vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11vaidarnamoro.release();
                        botaovaidarnamoro11.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botaovaidarnamoro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovaidarnamoro12.startAnimation(animacaobotao);
                Som12vaidarnamoro = MediaPlayer.create(TelaVaiDarNamoro.this,R.raw.som12vaidarnamoro);
                Som12vaidarnamoro.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12vaidarnamoro.start();
                    }
                });

                Som12vaidarnamoro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12vaidarnamoro.release();
                        botaovaidarnamoro12.clearAnimation();
                    }
                });

            }
        });
    }
}