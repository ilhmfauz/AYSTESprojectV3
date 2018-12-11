package com.example.farishy.aystesprojectv3;

public class QuestionPKN6 {
    public String mQuestion[] ={
            "dibawah ini sikap yang termasuk nilai-nilai juang dari para pendahulu kita kecuali...",
            "salah satu tujuan diadakannya kerja sama dengan negara-negara tetangga adalah..",
            "Utusan negara singapura yang ikut menandatangani Deklarasi Bangkok adalah..",
            "Negara di asia tenggara yang dikenal dengan sebutan negara tanpa pantai adalah..",
            "Bentuk kerja sama antarnegara ASEAN dalam rangka membentuk perdagangan bebas di kawasan Asia Tenggara adalah",
    };

    private  String mChoices[][] = {

            {"persaingan", "kedisiplinan", "musyawarah", "rela berkorban"},
            {"kepo", "mencari peperangan", "cari untung", "meningkatkan kesejahteraan"},
            {"Ilham", "Faris", "S.Rajaratnam", "Dani"},
            {"kamboja", "myanmar", "thailand", "laos"},
            {"AFTA", "OPEC", "APEC", "NAFTA"},
    };

    private String mCorrectAnswer[] = {"persaingan", "meningkatkan kesejahteraan", "S.Rajaratnam", "laos", "AFTA"};

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
