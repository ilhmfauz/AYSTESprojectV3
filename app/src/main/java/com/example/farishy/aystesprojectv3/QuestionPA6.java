package com.example.farishy.aystesprojectv3;

public class QuestionPA6 {
    public String mQuestion[] ={
            "mimikri adalah kemampuan adaptasi yang dimiliki hewan ..",
            "makhluk hidup menjaga kelestariannya dengan cara...",
            "berikut ini yang merupakan ciri pubertas yang dialami perempuan adalah..",
            "gajah adalah hewan bertulangbelakang dan berkembang biak dengan cara ...",
            "jenis hewan di pulau jawa yang sudah langka adalah..",
    };

    private  String mChoices[][] = {

            {"bekicot", "semut", "bunglon", "kecoa"},
            {"menghujat", "berkembang biak", "tawuran", "bernafas"},
            {"sering marah marah", "gajelas", "mengalami menstruasi", "tumbuh jakun"},
            {"vivipar", "konjungsi", "ovipar", "ovovivipar"},
            {"ulet kaki seribu", "bekicot", "kodok", "harimau jawa"},
    };

    private String mCorrectAnswer[] = {"bunglon", "berkembang biak", "mengalami menstruasi", "vivipar", "harimau jawa"};

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
