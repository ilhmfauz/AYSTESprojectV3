package com.example.farishy.aystesprojectv3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer backgrouPlayer;
    MediaPlayer soundEffects;
    Button btnSound;
    Button btnNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgrouPlayer = MediaPlayer.create(MainActivity.this, R.raw.menu_msc);
        backgrouPlayer.setLooping(true);
        backgrouPlayer.start();

        soundEffects = MediaPlayer.create(MainActivity.this, R.raw.click_effect);

        Button btn_mulai = (Button) this.findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                soundEffects.start();
                Intent i = new Intent(MainActivity.this, Instruksi.class);
                startActivity(i);
            }

        });

        final Button btn_pengaturan = (Button) this.findViewById(R.id.btn_pengaturan);
        btn_pengaturan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                soundEffects.start();
            }

        });

        Button btn_keluar = (Button) this.findViewById(R.id.btn_keluar);
        btn_keluar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                soundEffects.start();
                ActivityCompat.finishAffinity(MainActivity.this);
            }

        });


        btnSound = (Button) findViewById(R.id.btn_pengaturan);
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnSound.getText().equals(" ")){
                    btnSound.setBackgroundResource(R.drawable.mute);
                    btnSound.setText("  ");
                    backgrouPlayer.setVolume(0,0);
                }else if(btnSound.getText().equals("  ")){
                    btnSound.setBackgroundResource(R.drawable.sound);
                    btnSound.setText(" ");
                    backgrouPlayer.setVolume(1,1);
                }

            }
        });

    }

    public void onBackPressed(){

        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
        builder.setMessage("Kamu yakin ingin keluar?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityCompat.finishAffinity(MainActivity.this);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        android.support.v7.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(this.isFinishing()){
            backgrouPlayer.stop();
        }
    }


}
