package com.example.sonoplastium;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView botaoimage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        botaoimage1 = findViewById(R.id.botaoiniciar);
        botaoimage1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Animation animacaobotao = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim);
                botaoimage1.startAnimation(animacaobotao);
                Intent intent = new Intent(getApplicationContext(), TelaMenu.class);
                startActivity(intent);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fadein, R.anim.fadeout);
                ActivityCompat.startActivity(MainActivity.this, intent, activityOptionsCompat.toBundle());
            }
        });
    }
}