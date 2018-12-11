package com.example.farishy.aystesprojectv3;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class selesai extends AppCompatActivity {

    Button btn;
    TextView status, img_status, desc_status, score_tv;
    MediaPlayer SoundEffect5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);

        status = (TextView)findViewById(R.id.status);
        img_status = (TextView)findViewById(R.id.img_status);
        desc_status = (TextView)findViewById(R.id.desc_status);
        btn = (Button)findViewById(R.id.main_menu);
        score_tv = (TextView)findViewById(R.id.score_tv);


        SoundEffect5 = MediaPlayer.create(selesai.this, R.raw.click_effect);

        if(getIntent().getStringExtra("menang").equals("1")){
            status.setText("YEAY, KAMU MENANG");
            score_tv.setText("1000");
            desc_status.setText("'Ternyata kamu lebih pintar adari anak sekolah dasar.'");
            img_status.setBackgroundResource(R.drawable.happy_logo);
        }else if(getIntent().getStringExtra("menang").equals("0")){
            status.setText("YAH, KAMU KALAH");
            desc_status.setText("'Ternyata kamu tidak lebih pintar dari anak sekolah dasar.'");
            img_status.setBackgroundResource(R.drawable.sad_logo);
            score_tv.setText(getIntent().getStringExtra("score"));
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEffect5.start();
                Intent i = new Intent(selesai.this, MainActivity.class);
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
                Intent i = new Intent(selesai.this, MainActivity.class);
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
