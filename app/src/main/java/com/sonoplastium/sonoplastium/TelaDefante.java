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

public class TelaDefante extends AppCompatActivity {

    ImageView botaovoltar8;
    ImageView botao1defante;
    ImageView botao2defante;
    ImageView botao3defante;
    ImageView botao4defante;
    ImageView botao5defante;
    ImageView botao6defante;
    ImageView botao7defante;
    ImageView botao8defante;
    ImageView botao9defante;
    ImageView botao10defante;
    ImageView botao11defante;
    ImageView botao12defante;

    MediaPlayer Som1defante;
    MediaPlayer Som2defante;
    MediaPlayer Som3defante;
    MediaPlayer Som4defante;
    MediaPlayer Som5defante;
    MediaPlayer Som6defante;
    MediaPlayer Som7defante;
    MediaPlayer Som8defante;
    MediaPlayer Som9defante;
    MediaPlayer Som10defante;
    MediaPlayer Som11defante;
    MediaPlayer Som12defante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tela_defante);
        botaovoltar8 = findViewById(R.id.botaovoltar8);
        botao1defante = findViewById(R.id.botaodefante1);
        botao2defante = findViewById(R.id.botaodefante2);
        botao3defante = findViewById(R.id.botaodefante3);
        botao4defante = findViewById(R.id.botaodefante4);
        botao5defante = findViewById(R.id.botaodefante5);
        botao6defante = findViewById(R.id.botaodefante6);
        botao7defante = findViewById(R.id.botaodefante7);
        botao8defante = findViewById(R.id.botaodefante8);
        botao9defante = findViewById(R.id.botaodefante9);
        botao10defante = findViewById(R.id.botaodefante10);
        botao11defante = findViewById(R.id.botaodefante11);
        botao12defante = findViewById(R.id.botaodefante12);



        botaovoltar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaovoltar8.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
            }
        });

        //Ativação do som no botão 1
        botao1defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao1defante.startAnimation(animacaobotao);
                Som1defante = MediaPlayer.create(TelaDefante.this,R.raw.som1defante);
                Som1defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som1defante.start();
                    }
                });

                Som1defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som1defante.release();
                        botao1defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 2
        botao2defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao2defante.startAnimation(animacaobotao);
                Som2defante = MediaPlayer.create(TelaDefante.this,R.raw.som2defante);
                Som2defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som2defante.start();
                    }
                });

                Som2defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som2defante.release();
                        botao2defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 3
        botao3defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao3defante.startAnimation(animacaobotao);
                Som3defante = MediaPlayer.create(TelaDefante.this,R.raw.som3defante);
                Som3defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som3defante.start();
                    }
                });

                Som3defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som3defante.release();
                        botao3defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 4
        botao4defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao4defante.startAnimation(animacaobotao);
                Som4defante = MediaPlayer.create(TelaDefante.this,R.raw.som4defante);
                Som4defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som4defante.start();
                    }
                });

                Som4defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som4defante.release();
                        botao4defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 5
        botao5defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao5defante.startAnimation(animacaobotao);
                Som5defante= MediaPlayer.create(TelaDefante.this,R.raw.som5defante);
                Som5defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som5defante.start();
                    }
                });

                Som5defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som5defante.release();
                        botao5defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 6
        botao6defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao6defante.startAnimation(animacaobotao);
                Som6defante = MediaPlayer.create(TelaDefante.this,R.raw.som6defante);
                Som6defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som6defante.start();
                    }
                });

                Som6defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som6defante.release();
                        botao6defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 7
        botao7defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao7defante.startAnimation(animacaobotao);
                Som7defante = MediaPlayer.create(TelaDefante.this,R.raw.som7defante);
                Som7defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som7defante.start();
                    }
                });

                Som7defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som7defante.release();
                        botao7defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 8
        botao8defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao8defante.startAnimation(animacaobotao);
                Som8defante = MediaPlayer.create(TelaDefante.this,R.raw.som8defante);
                Som8defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som8defante.start();
                    }
                });

                Som8defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som8defante.release();
                        botao8defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 9
        botao9defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao9defante.startAnimation(animacaobotao);
                Som9defante = MediaPlayer.create(TelaDefante.this,R.raw.som9defante);
                Som9defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som9defante.start();
                    }
                });

                Som9defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som9defante.release();
                        botao9defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 10
        botao10defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao10defante.startAnimation(animacaobotao);
                Som10defante = MediaPlayer.create(TelaDefante.this,R.raw.som10defante);
                Som10defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som10defante.start();
                    }
                });

                Som10defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som10defante.release();
                        botao10defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 11
        botao11defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao11defante.startAnimation(animacaobotao);
                Som11defante = MediaPlayer.create(TelaDefante.this,R.raw.som11defante);
                Som11defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som11defante.start();
                    }
                });

                Som11defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som11defante.release();
                        botao11defante.clearAnimation();
                    }
                });

            }
        });

        //Ativação do som no botão 12
        botao12defante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botao12defante.startAnimation(animacaobotao);
                Som12defante = MediaPlayer.create(TelaDefante.this,R.raw.som12defante);
                Som12defante.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        Som12defante.start();
                    }
                });

                Som12defante.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Som12defante.release();
                        botao12defante.clearAnimation();
                    }
                });

            }
        });


    }
}