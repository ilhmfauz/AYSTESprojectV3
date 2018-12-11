package com.example.farishy.aystesprojectv3;

public class QuestionMK3 {
    public String mQuestion[] ={
            "Untuk bilangan a dan b berlaku sifat a + b = b + a. Sifat ini disebut sifat ...",
            "KPK dari 8 dan 2 adalah ... ",
            "Nabil menghadap ke arah timur. Kemudian dia berputar 3/4 putaran searah jarum jam. Menghadap ke arah mana Nabil sekarang?",
            "3 kodi + 2 lusin = .. buah",
            "Bilangan 245 jika ditulis bilangan romawi adalah ...",
    };

    private  String mChoices[][] = {

            {"asosiatif perkalian", "asosiatif penjumlahan", "komutatif perkalian", "komutatif penjumlahan"},
            {"24", "48", "8", "12"},
            {"utara", "selatan", "barat", "barat daya"},
            {"60", "120", "50", "84"},
            {"CCXLV", "CCVL", "LVCC", "LCCV"},
    };

    private String mCorrectAnswer[] = {"komutatif penjumlahan", "8", "utara", "84", "CCXLV"};

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
