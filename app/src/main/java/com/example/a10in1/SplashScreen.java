package com.example.a10in1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);


        final Intent i = new Intent(SplashScreen.this,MainActivity.class);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);//2 secs
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
