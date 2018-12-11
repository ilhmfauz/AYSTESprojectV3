package com.example.farishy.aystesprojectv3;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lanjut_menyerah extends AppCompatActivity {

    Button btn_iya;
    Button btn_tidak;
    MediaPlayer SoundEffect4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanjut_menyerah);

        btn_iya = (Button)findViewById(R.id.btn_iya);
        btn_tidak = (Button)findViewById(R.id.btn_tidak);
        final kategori mKategori = new kategori();

        TextView ts = (TextView) findViewById(R.id.tv_lanjut);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/akaChen.otf");
        ts.setTypeface(tf);


        SoundEffect4 = MediaPlayer.create(lanjut_menyerah.this, R.raw.click_effect);

        btn_iya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect4.start();
                Intent i = new Intent(lanjut_menyerah.this, kategori.class);
                if(getIntent().getStringExtra("kategori").equals("Bahasa Indonesia Kelas 2")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9","disable");
                }
                if(getIntent().getStringExtra("kategori").equals("Bahasa Inggris Kelas 3")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6","disable");
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Pengetahuan Alam Kelas 1")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8","disable");
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Matematika Kelas 3")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7","disable");
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("TIK Kelas 4")){
                    i.putExtra("status","disable");
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Seni Budaya Kelas 4")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5","disable");
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Pengetahuan Sosial Kelas 5")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3","disable");
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Bahasa Inggris Kelas 5")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4","disable");
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("Pengetahuan Alam Kelas 6")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1","disable");
                    i.putExtra("status2",getIntent().getStringExtra("status2"));
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                if(getIntent().getStringExtra("kategori").equals("PPkN Kelas 6")){
                    i.putExtra("status",getIntent().getStringExtra("status"));
                    i.putExtra("status1",getIntent().getStringExtra("status1"));
                    i.putExtra("status2","disable");
                    i.putExtra("status3",getIntent().getStringExtra("status3"));
                    i.putExtra("status4",getIntent().getStringExtra("status4"));
                    i.putExtra("status5",getIntent().getStringExtra("status5"));
                    i.putExtra("status6",getIntent().getStringExtra("status6"));
                    i.putExtra("status7",getIntent().getStringExtra("status7"));
                    i.putExtra("status8",getIntent().getStringExtra("status8"));
                    i.putExtra("status9",getIntent().getStringExtra("status9"));
                }
                i.putExtra("level", getIntent().getStringExtra("level"));
                i.putExtra("score", getIntent().getStringExtra("score"));
                startActivity(i);
            }
        });

        btn_tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect4.start();
                Intent i2 = new Intent(lanjut_menyerah.this, selesai.class);
                i2.putExtra("menang", "0");
                i2.putExtra("score", getIntent().getStringExtra("score"));
                startActivity(i2);
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
                Intent i = new Intent(lanjut_menyerah.this, MainActivity.class);
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
