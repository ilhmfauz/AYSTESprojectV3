package com.example.farishy.aystesprojectv3;

public class QuestionBI2 {
    public String mQuestion[] ={
            "ibu - menanam - senang - tanaman. Susunan kalimat yang benar yaitu...",
            "Jilan mematuhi nasihat orang tua. Kata mematuhi kata dasarnya adalah... ",
            "Iqbal sedang curhat. Jadi teman Iqbal harus..",
            "Dani pergi ke kampus. Kalimat tanya yang sesuai dengan jawaban diatas...",
            "setiap mandi kirana tidak lupa (gosok) gigi. kata yang tepat dalam kurung adalah.. ",
    };

    private  String mChoices[][] = {

            {"ibu senang menanam tanaman", "senang tanaman ibu menanam", "tanaman senang menanam ibu ", "ibu senang tanaman menanam"},
            {"patuh", "patu", "sepatu", "bebel"},
            {"tampan", "sepi", "kaya", "tenang"},
            {"senangkah hati dani?", "resahkah hati dani?", "apakah dani bermain? ", "kemana dani pergi?"},
            {"menggosok", "digosok", "digaruk", "digigit"},
    };

    private String mCorrectAnswer[] = {"ibu senang menanam tanaman", "patuh", "tenang", "kemana dani pergi?", "menggosok"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorretAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

