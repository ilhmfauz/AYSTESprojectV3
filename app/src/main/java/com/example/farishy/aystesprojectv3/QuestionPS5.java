package com.example.farishy.aystesprojectv3;

public class QuestionPS5 {
    public String mQuestion[] ={
            "Jalur laut yang berjarak 12 mil laut dari garis dasar ke laut lepas dinamakan...",
            "Hutan yang selalu menghijau sangat lebat yang terletak disekitar Khatulistiwa disebut hutan..",
            "Karya sastra yang berisi cerita pelipur lara disebut ...",
            "Berikut ini prasasti Kerajaan Tarumanegara, kecuali..",
            "Kerajaan Kutai yang berdiri pada abad ke -4 terletak di tepi...",
    };

    private  String mChoices[][] = {

            {"Landas Kontinen", "Zona International", "ZEE", "Zona Laut Teritorial"},
            {"tropis", "sabana", "rawa", "pegunungan"},
            {"hikayat", "suluk", "sajak", "tasawuf"},
            {"Tugu", "Kedukan Bukit", "Pasir Awi", "Muara Ciaten"},
            {"sungai kapuas", "sungai barito", "sungai mahakam", "sungai kahayan"},
    };

    private String mCorrectAnswer[] = {"Zona Laut Teritorial", "tropis", "hikayat", "Kedukan Bukit", "sungai mahakam"};

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
