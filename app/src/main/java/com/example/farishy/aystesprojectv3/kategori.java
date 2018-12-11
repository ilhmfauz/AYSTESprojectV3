package com.example.farishy.aystesprojectv3;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kategori extends AppCompatActivity {

    Button ktg, ktg1, ktg2, ktg3, ktg4, ktg5, ktg6, ktg7, ktg8, ktg9;
    private soal mSoal = new soal();
    MediaPlayer SoundEffect3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        TextView ts = (TextView) findViewById(R.id.tv_tentukan);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/akaChen.otf");
        ts.setTypeface(tf);

        SoundEffect3 = MediaPlayer.create(kategori.this, R.raw.click_effect);

        ktg = (Button) findViewById(R.id.ktg);
        ktg1 = (Button) findViewById(R.id.ktg1);
        ktg2 = (Button) findViewById(R.id.ktg2);
        ktg3 = (Button) findViewById(R.id.ktg3);
        ktg4 = (Button) findViewById(R.id.ktg4);
        ktg5 = (Button) findViewById(R.id.ktg5);
        ktg6 = (Button) findViewById(R.id.ktg6);
        ktg7 = (Button) findViewById(R.id.ktg7);
        ktg8 = (Button) findViewById(R.id.ktg8);
        ktg9 = (Button) findViewById(R.id.ktg9);

        String status = getIntent().getStringExtra("status");
        String status1 = getIntent().getStringExtra("status1");
        String status2 = getIntent().getStringExtra("status2");
        String status3 = getIntent().getStringExtra("status3");
        String status4 = getIntent().getStringExtra("status4");
        String status5 = getIntent().getStringExtra("status5");
        String status6 = getIntent().getStringExtra("status6");
        String status7 = getIntent().getStringExtra("status7");
        String status8 = getIntent().getStringExtra("status8");
        String status9 = getIntent().getStringExtra("status9");
        final String level = getIntent().getStringExtra("level");
        final String score = getIntent().getStringExtra("score");

        if(status.equals("disable")){
            ktg.setEnabled(false);
            ktg.setTextColor(Color.DKGRAY);
            ktg.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status1.equals("disable")){
            ktg1.setEnabled(false);
            ktg1.setTextColor(Color.DKGRAY);
            ktg1.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status2.equals("disable")){
            ktg2.setEnabled(false);
            ktg2.setTextColor(Color.DKGRAY);
            ktg2.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status3.equals("disable")){
            ktg3.setEnabled(false);
            ktg3.setTextColor(Color.DKGRAY);
            ktg3.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status4.equals("disable")){
            ktg4.setEnabled(false);
            ktg4.setTextColor(Color.DKGRAY);
            ktg4.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status5.equals("disable")){
            ktg5.setEnabled(false);
            ktg5.setTextColor(Color.DKGRAY);
            ktg5.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status6.equals("disable")){
            ktg6.setEnabled(false);
            ktg6.setTextColor(Color.DKGRAY);
            ktg6.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status7.equals("disable")){
            ktg7.setEnabled(false);
            ktg7.setTextColor(Color.DKGRAY);
            ktg7.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status8.equals("disable")){
            ktg8.setEnabled(false);
            ktg8.setTextColor(Color.DKGRAY);
            ktg8.setBackgroundResource(R.drawable.btn_disable);
        }
        if(status9.equals("disable")){
            ktg9.setEnabled(false);
            ktg9.setTextColor(Color.DKGRAY);
            ktg9.setBackgroundResource(R.drawable.btn_disable);
        }

        ktg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg1.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg2.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg3.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg4.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg5.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg6.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg7.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg8.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });
        ktg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect3.start();
                int level_int = Integer.parseInt(level);
                int level_jml = level_int+1;
                String levelStr = String.valueOf(level_jml);
                Intent i = new Intent(kategori.this, soal.class);
                i.putExtra("kategori", ktg9.getText());
                i.putExtra("status",getIntent().getStringExtra("status"));
                i.putExtra("status1",getIntent().getStringExtra("status1"));
                i.putExtra("status2",getIntent().getStringExtra("status2"));
                i.putExtra("status3",getIntent().getStringExtra("status3"));
                i.putExtra("status4",getIntent().getStringExtra("status4"));
                i.putExtra("status5",getIntent().getStringExtra("status5"));
                i.putExtra("status6",getIntent().getStringExtra("status6"));
                i.putExtra("status7",getIntent().getStringExtra("status7"));
                i.putExtra("status8",getIntent().getStringExtra("status8"));
                i.putExtra("status9",getIntent().getStringExtra("status9"));
                i.putExtra("levelStr", levelStr);
                i.putExtra("score", score);
                startActivity(i);
            }
        });

    }

    public void onBackPressed(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Kamu yakin ingin keluar?!");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(kategori.this, MainActivity.class);
                startActivity(i);
            }
        });
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
