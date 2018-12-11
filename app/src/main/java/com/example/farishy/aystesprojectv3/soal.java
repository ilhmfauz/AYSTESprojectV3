package com.example.farishy.aystesprojectv3;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class soal extends AppCompatActivity {

    Button btn_a, btn_b, btn_c, btn_d;
    TextView  Question, Score, CountDown, Category_TV, Level_tv;
    MediaPlayer SoundEffectCorrect,SoundEffectWrong;

    private QuestionPA1 mQuestionPA1 = new QuestionPA1();
    private QuestionBI2 mQuestionBI2 = new QuestionBI2();
    private QuestionEN3 mQuestionEN3 = new QuestionEN3();
    private QuestionMK3 mQuestionMK3 = new QuestionMK3();
    private QuestionTIK4 mQuestionTIK4 = new QuestionTIK4();
    private QuestionSBK4 mQuestionSBK4 = new QuestionSBK4();
    private QuestionPS5 mQuestionPS5 = new QuestionPS5();
    private QuestionEN5 mQuestionEN5 = new QuestionEN5();
    private QuestionPA6 mQuestionPA6 = new QuestionPA6();
    private QuestionPKN6 mQuestionPKN6 = new QuestionPKN6();

    private String mAnswer;
    private int mScore = 0;
    private int mScoreCheckpoint = 0;
    int level;


    public static final long COUNTDOWN_IN_MILLIS = 30000;

    CountDownTimer countDownTimer;
    long timeLeftInMillis;


    int mQustionLenghtPA1 = mQuestionPA1.mQuestion.length;
    int mQustionLenghtBI2 = mQuestionBI2.mQuestion.length;
    int mQustionLenghtEN3 = mQuestionEN3.mQuestion.length;
    int mQustionLenghtMK3 = mQuestionMK3.mQuestion.length;
    int mQustionLenghtTIK4 = mQuestionTIK4.mQuestion.length;
    int mQustionLenghtSBK4 = mQuestionSBK4.mQuestion.length;
    int mQustionLenghtPS5 = mQuestionPS5.mQuestion.length;
    int mQustionLenghtEN5 = mQuestionEN5.mQuestion.length;
    int mQustionLenghtPA6 = mQuestionPA6.mQuestion.length;
    int mQustionLenghtPKN6 = mQuestionPKN6.mQuestion.length;


    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        SoundEffectCorrect = MediaPlayer.create(soal.this, R.raw.correct);
        SoundEffectWrong = MediaPlayer.create(soal.this, R.raw.wrong);

        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();

        btn_a = (Button) findViewById(R.id.btn_a);
        btn_b = (Button) findViewById(R.id.btn_b);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_d = (Button) findViewById(R.id.btn_d);
        Score = (TextView) findViewById(R.id.Score);
        Question = (TextView) findViewById(R.id.Question);
        CountDown = (TextView) findViewById(R.id.CountDown);
        Category_TV = (TextView) findViewById(R.id.Category_TV);
        Level_tv = (TextView) findViewById(R.id.Level_tv);

        r = new Random();

        final String levelStr = getIntent().getStringExtra("levelStr");
        level = Integer.parseInt(levelStr);

        Score.setText("Score : " +getIntent().getStringExtra("score"));
        Level_tv.setText("LEVEL : "+levelStr);

        if(getIntent().getStringExtra("kategori").equals("Bahasa Indonesia Kelas 2")){
            updateQuestionBI2(r.nextInt(mQustionLenghtBI2));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Bahasa Inggris Kelas 3")){
            updateQuestionEN3(r.nextInt(mQustionLenghtEN3));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Pengetahuan Alam Kelas 1")){
            updateQuestionPA1(r.nextInt(mQustionLenghtPA1));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Matematika Kelas 3")){
            updateQuestionMK3(r.nextInt(mQustionLenghtMK3));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("TIK Kelas 4")){
            updateQuestionTIK4(r.nextInt(mQustionLenghtTIK4));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Seni Budaya Kelas 4")){
            updateQuestionSBK4(r.nextInt(mQustionLenghtSBK4));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Pengetahuan Sosial Kelas 5")){
            updateQuestionPS5(r.nextInt(mQustionLenghtPS5));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Bahasa Inggris Kelas 5")){
            updateQuestionEN5(r.nextInt(mQustionLenghtEN5));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("Pengetahuan Alam Kelas 6")){
            updateQuestionPA6(r.nextInt(mQustionLenghtPA6));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }else if(getIntent().getStringExtra("kategori").equals("PPkN Kelas 6")){
            updateQuestionPKN6(r.nextInt(mQustionLenghtPKN6));
            Category_TV.setText(getIntent().getStringExtra("kategori"));
        }


        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_a.getText() == mAnswer) {
                    SoundEffectCorrect.start();
                    if(levelStr.equals("10")){
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, selesai.class);
                        i.putExtra("menang", "1");
                        startActivity(i);
                    }else{
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, lanjut_menyerah.class);
                        if(Category_TV.getText().equals("TIK Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("PPkN Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Sosial Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Seni Budaya Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Matematika Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 1")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else{
                            i.putExtra("kategori",Category_TV.getText());
                        }

                        if(levelStr.equals("1")){
                            i.putExtra("score","5" );
                        }else if(levelStr.equals("2")){
                            i.putExtra("score","25" );
                        }else if(levelStr.equals("3")){
                            i.putExtra("score","75" );
                        }else if(levelStr.equals("4")){
                            i.putExtra("score","130" );
                        }else if(levelStr.equals("5")){
                            i.putExtra("score","200" );
                        }else if(levelStr.equals("6")){
                            i.putExtra("score","275" );
                        }else if(levelStr.equals("7")){
                            i.putExtra("score","450" );
                        }else if(levelStr.equals("8")){
                            i.putExtra("score","675" );
                        }else if(levelStr.equals("9")){
                            i.putExtra("score","780" );
                        }else{
                            i.putExtra("score","1000" );
                        }

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
                        i.putExtra("level", levelStr);
                        startActivity(i);
                    }
                }else if(btn_a.getText() != mAnswer){
                    countDownTimer.cancel();
                    timeOut();
                    SoundEffectWrong.start();
                }

            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_b.getText() == mAnswer) {
                    SoundEffectCorrect.start();
                    if(levelStr.equals("10")){
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, selesai.class);
                        i.putExtra("menang", "1");
                        startActivity(i);
                    }else{
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, lanjut_menyerah.class);
                        if(Category_TV.getText().equals("TIK Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("PPkN Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Sosial Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Seni Budaya Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Matematika Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 1")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else{
                            i.putExtra("kategori",Category_TV.getText());
                        }

                        if(levelStr.equals("1")){
                            i.putExtra("score","5" );
                        }else if(levelStr.equals("2")){
                            i.putExtra("score","25" );
                        }else if(levelStr.equals("3")){
                            i.putExtra("score","75" );
                        }else if(levelStr.equals("4")){
                            i.putExtra("score","130" );
                        }else if(levelStr.equals("5")){
                            i.putExtra("score","200" );
                        }else if(levelStr.equals("6")){
                            i.putExtra("score","275" );
                        }else if(levelStr.equals("7")){
                            i.putExtra("score","450" );
                        }else if(levelStr.equals("8")){
                            i.putExtra("score","675" );
                        }else if(levelStr.equals("9")){
                            i.putExtra("score","780" );
                        }else{
                            i.putExtra("score","1000" );
                        }

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
                        i.putExtra("level", levelStr);
                        startActivity(i);
                    }
                }else if(btn_b.getText() != mAnswer){
                    countDownTimer.cancel();
                    timeOut();
                    SoundEffectWrong.start();
                }
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_c.getText() == mAnswer) {
                    SoundEffectCorrect.start();
                    if(levelStr.equals("10")){
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, selesai.class);
                        i.putExtra("menang", "1");
                        startActivity(i);
                    }else{
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, lanjut_menyerah.class);
                        if(Category_TV.getText().equals("TIK Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("PPkN Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Sosial Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Seni Budaya Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Matematika Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 1")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else{
                            i.putExtra("kategori",Category_TV.getText());
                        }

                        if(levelStr.equals("1")){
                            i.putExtra("score","5" );
                        }else if(levelStr.equals("2")){
                            i.putExtra("score","25" );
                        }else if(levelStr.equals("3")){
                            i.putExtra("score","75" );
                        }else if(levelStr.equals("4")){
                            i.putExtra("score","130" );
                        }else if(levelStr.equals("5")){
                            i.putExtra("score","200" );
                        }else if(levelStr.equals("6")){
                            i.putExtra("score","275" );
                        }else if(levelStr.equals("7")){
                            i.putExtra("score","450" );
                        }else if(levelStr.equals("8")){
                            i.putExtra("score","675" );
                        }else if(levelStr.equals("9")){
                            i.putExtra("score","780" );
                        }else{
                            i.putExtra("score","1000" );
                        }

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
                        i.putExtra("level", levelStr);
                        startActivity(i);
                    }
                }else if(btn_c.getText() != mAnswer){
                    countDownTimer.cancel();
                    timeOut();
                    SoundEffectWrong.start();
                }

            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_d.getText() == mAnswer) {
                    SoundEffectCorrect.start();
                    if(levelStr.equals("10")){
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, selesai.class);
                        i.putExtra("menang", "1");
                        startActivity(i);
                    }else{
                        countDownTimer.cancel();
                        Intent i = new Intent(soal.this, lanjut_menyerah.class);
                        if(Category_TV.getText().equals("TIK Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("PPkN Kelas 6")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Sosial Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 5")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Seni Budaya Kelas 4")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Bahasa Inggris Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Matematika Kelas 3")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else if(Category_TV.getText().equals("Pengetahuan Alam Kelas 1")){
                            i.putExtra("kategori",Category_TV.getText());
                        }else{
                            i.putExtra("kategori",Category_TV.getText());
                        }

                        if(levelStr.equals("1")){
                            i.putExtra("score","5" );
                        }else if(levelStr.equals("2")){
                            i.putExtra("score","25" );
                        }else if(levelStr.equals("3")){
                            i.putExtra("score","75" );
                        }else if(levelStr.equals("4")){
                            i.putExtra("score","130" );
                        }else if(levelStr.equals("5")){
                            i.putExtra("score","200" );
                        }else if(levelStr.equals("6")){
                            i.putExtra("score","275" );
                        }else if(levelStr.equals("7")){
                            i.putExtra("score","450" );
                        }else if(levelStr.equals("8")){
                            i.putExtra("score","675" );
                        }else if(levelStr.equals("9")){
                            i.putExtra("score","780" );
                        }else{
                            i.putExtra("score","1000" );
                        }

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
                        i.putExtra("level", levelStr);
                        startActivity(i);
                    }
                }else if(btn_d.getText() != mAnswer){
                    countDownTimer.cancel();
                    timeOut();
                    SoundEffectWrong.start();
                }

            }
        });


    }

    public void updateQuestionPA1(int num){
        Question.setText(mQuestionPA1.getQuestion(num));
        btn_a.setText(mQuestionPA1.getChoice1(num));
        btn_b.setText(mQuestionPA1.getChoice2(num));
        btn_c.setText(mQuestionPA1.getChoice3(num));
        btn_d.setText(mQuestionPA1.getChoice4(num));

        mAnswer = mQuestionPA1.getCorretAnswer(num);
    }

    public void updateQuestionBI2(int num){
        Question.setText(mQuestionBI2.getQuestion(num));
        btn_a.setText(mQuestionBI2.getChoice1(num));
        btn_b.setText(mQuestionBI2.getChoice2(num));
        btn_c.setText(mQuestionBI2.getChoice3(num));
        btn_d.setText(mQuestionBI2.getChoice4(num));

        mAnswer = mQuestionBI2.getCorretAnswer(num);
    }

    public void updateQuestionEN3(int num){
        Question.setText(mQuestionEN3.getQuestion(num));
        btn_a.setText(mQuestionEN3.getChoice1(num));
        btn_b.setText(mQuestionEN3.getChoice2(num));
        btn_c.setText(mQuestionEN3.getChoice3(num));
        btn_d.setText(mQuestionEN3.getChoice4(num));

        mAnswer = mQuestionEN3.getCorretAnswer(num);
    }

    public void updateQuestionMK3(int num){
        Question.setText(mQuestionMK3.getQuestion(num));
        btn_a.setText(mQuestionMK3.getChoice1(num));
        btn_b.setText(mQuestionMK3.getChoice2(num));
        btn_c.setText(mQuestionMK3.getChoice3(num));
        btn_d.setText(mQuestionMK3.getChoice4(num));

        mAnswer = mQuestionMK3.getCorretAnswer(num);
    }

    public void updateQuestionTIK4(int num){
        Question.setText(mQuestionTIK4.getQuestion(num));
        btn_a.setText(mQuestionTIK4.getChoice1(num));
        btn_b.setText(mQuestionTIK4.getChoice2(num));
        btn_c.setText(mQuestionTIK4.getChoice3(num));
        btn_d.setText(mQuestionTIK4.getChoice4(num));

        mAnswer = mQuestionTIK4.getCorretAnswer(num);
    }

    public void updateQuestionSBK4(int num){
        Question.setText(mQuestionSBK4.getQuestion(num));
        btn_a.setText(mQuestionSBK4.getChoice1(num));
        btn_b.setText(mQuestionSBK4.getChoice2(num));
        btn_c.setText(mQuestionSBK4.getChoice3(num));
        btn_d.setText(mQuestionSBK4.getChoice4(num));

        mAnswer = mQuestionSBK4.getCorretAnswer(num);
    }

    public void updateQuestionPS5(int num){
        Question.setText(mQuestionPS5.getQuestion(num));
        btn_a.setText(mQuestionPS5.getChoice1(num));
        btn_b.setText(mQuestionPS5.getChoice2(num));
        btn_c.setText(mQuestionPS5.getChoice3(num));
        btn_d.setText(mQuestionPS5.getChoice4(num));

        mAnswer = mQuestionPS5.getCorretAnswer(num);
    }

    public void updateQuestionEN5(int num){
        Question.setText(mQuestionEN5.getQuestion(num));
        btn_a.setText(mQuestionEN5.getChoice1(num));
        btn_b.setText(mQuestionEN5.getChoice2(num));
        btn_c.setText(mQuestionEN5.getChoice3(num));
        btn_d.setText(mQuestionEN5.getChoice4(num));

        mAnswer = mQuestionEN5.getCorretAnswer(num);
    }

    public void updateQuestionPA6(int num){
        Question.setText(mQuestionPA6.getQuestion(num));
        btn_a.setText(mQuestionPA6.getChoice1(num));
        btn_b.setText(mQuestionPA6.getChoice2(num));
        btn_c.setText(mQuestionPA6.getChoice3(num));
        btn_d.setText(mQuestionPA6.getChoice4(num));

        mAnswer = mQuestionPA6.getCorretAnswer(num);
    }

    public void updateQuestionPKN6(int num){
        Question.setText(mQuestionPKN6.getQuestion(num));
        btn_a.setText(mQuestionPKN6.getChoice1(num));
        btn_b.setText(mQuestionPKN6.getChoice2(num));
        btn_c.setText(mQuestionPKN6.getChoice3(num));
        btn_d.setText(mQuestionPKN6.getChoice4(num));

        mAnswer = mQuestionPKN6.getCorretAnswer(num);
    }

    public void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                timeOut();
            }
        }.start();
    }
    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds);

        CountDown.setText(timeFormatted);

        if (timeLeftInMillis < 10000) {
            CountDown.setTextColor(Color.RED);
        } else {
            CountDown.setTextColor(Color.BLACK);
        }
    }
    private void timeOut(){
        Intent i2 = new Intent(soal.this, selesai.class);
        i2.putExtra("menang", "0");
        if(level <= 3){
            i2.putExtra("score", "0");
        }else if(level <= 5){
            i2.putExtra("score", "75");
        }else if(level <= 8){
            i2.putExtra("score","200");
        }else{
            i2.putExtra("score", "675");
        }
        startActivity(i2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void onBackPressed(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Kamu yakin ingin keluar?!");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(soal.this, MainActivity.class);
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
