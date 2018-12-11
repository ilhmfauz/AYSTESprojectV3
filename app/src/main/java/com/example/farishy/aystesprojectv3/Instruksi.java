package com.example.farishy.aystesprojectv3;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Instruksi extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper vf;
    Button next;
    Button previous;
    Button mengerti;
    MediaPlayer SoundEffect2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruksi);

        SoundEffect2 = MediaPlayer.create(Instruksi.this, R.raw.click_effect);

        vf = (ViewFlipper) findViewById(R.id.instruksi);
        next = (Button) findViewById(R.id.btn_next);
        previous = (Button) findViewById(R.id.btn_previous);
        mengerti = (Button) findViewById(R.id.btn_mengerti);

        TextView ts = (TextView) findViewById(R.id.tv_ip);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/akaChen.otf");
        ts.setTypeface(tf);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        mengerti.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v == next){
            vf.showNext();
            SoundEffect2.start();
        }else if(v == previous){
            vf.showPrevious();
            SoundEffect2.start();
        }else if(v == mengerti){
            SoundEffect2.start();
            Intent i = new Intent(Instruksi.this, kategori.class);
            i.putExtra("status"," ");
            i.putExtra("status1"," ");
            i.putExtra("status2"," ");
            i.putExtra("status3"," ");
            i.putExtra("status4"," ");
            i.putExtra("status5"," ");
            i.putExtra("status6"," ");
            i.putExtra("status7"," ");
            i.putExtra("status8"," ");
            i.putExtra("status9"," ");
            i.putExtra("level", "0");
            i.putExtra("score", "0");
            startActivity(i);
        }
    }

}
