package com.example.ac1uf2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Integer estat=0;
    Integer punts=0;
    AnimationDrawable clockani;

    boolean []solved=new boolean[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ap=findViewById(R.id.imageViewAp);
        final ImageView app=findViewById(R.id.imageViewApp);
        final ImageView an=findViewById(R.id.imageViewAm);
        final ImageView and=findViewById(R.id.imageViewAnd);
        final ImageView sy=findViewById(R.id.imageViewSy);
        final ImageView sym=findViewById(R.id.imageViewSym);

        ImageView clock = (ImageView) findViewById(R.id.imageView2);
        clock.setBackgroundResource(R.drawable.clock);
        clockani = (AnimationDrawable) clock.getBackground();

        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clockani.start();
            }
        });

        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ap.setImageResource(R.drawable.apple);
                if (estat==2){
                    punts++;
                    solved[0]=true;
                    solved[1]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=1;
                }else{estat=0;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                app.setImageResource(R.drawable.apple);
                if (estat==1){
                    punts=punts+1;
                    solved[0]=true;
                    solved[1]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=2;
                }else{estat=0;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });
        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                an.setImageResource(R.drawable.droid);
                if (estat==3){
                    punts++;
                    solved[2]=true;
                    solved[3]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=4;
                }else{estat=0;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });
        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                and.setImageResource(R.drawable.droid);
                if (estat==4){
                    punts++;
                    solved[2]=true;
                    solved[3]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=3;
                }else{estat=0;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sy.setImageResource(R.drawable.symbian);
                if (estat==5){
                    punts++;
                    solved[4]=true;
                    solved[5]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=6;
                }else{estat=0;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });
        sym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sym.setImageResource(R.drawable.symbian);
                if (estat==6){
                    punts++;
                    solved[4]=true;
                    solved[5]=true;
                    solucionat(punts);
                }else if(estat==0){
                    clockani.start();
                    estat=5;
                }else{estat=0;

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flip(solved);}
            }
        });




    }
    public void flip(boolean[]solved){
        ImageView[]image=new ImageView[6];
        image[0]=findViewById(R.id.imageViewAp);
        image[1]=findViewById(R.id.imageViewApp);
        image[2]=findViewById(R.id.imageViewAm);
        image[3]=findViewById(R.id.imageViewAnd);
        image[4]=findViewById(R.id.imageViewSy);
        image[5]=findViewById(R.id.imageViewSym);

        for (int i = 0; i <image.length ; i++) {
            if (!solved[i]){
                image[i].setImageResource(R.drawable.dorso);
            }
        }

    }
    public void solucionat(int punts){
        if(punts==3){
            ImageView spaceshipImage = (ImageView) findViewById(R.id.imageViewAnd);
            Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
            spaceshipImage.startAnimation(hyperspaceJumpAnimation);

        }
}}
