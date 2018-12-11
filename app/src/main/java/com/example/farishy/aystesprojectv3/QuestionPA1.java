package com.example.farishy.aystesprojectv3;

public class QuestionPA1 {
    public String mQuestion[] ={
            "ikan memiliki ... untuk bernafas",
            "mata kucing terletak di..",
            "akar bunga mawar terdapat di..",
            "jenis pohon yang memiliki batang tidak bercabang adalah..",
            "setelah bertelur, ayam betina akan .. telurnya",
    };

    private  String mChoices[][] = {

            {"hidung", "paru paru", "insang", "ginjal"},
            {"sepedah", "motor", "kepala", "kaki"},
            {"batang", "dalam tanah", "bawah daun", "langit"},
            {"mangga", "kelapa", "jeruk", "duren"},
            {"makan", "goreng", "rebus", "mengerami"},
    };

    private String mCorrectAnswer[] = {"insang", "kepala", "dalam tanah", "kelapa", "mengerami"};

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
