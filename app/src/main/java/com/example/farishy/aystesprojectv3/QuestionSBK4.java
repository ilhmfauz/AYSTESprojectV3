package com.example.farishy.aystesprojectv3;

public class QuestionSBK4 {
    public String mQuestion[] ={
            "Jika ingin menggambar tumbuh-tumbuhan sebaiknya mengamati ....",
            "Rumah gadang adalah rumah adat dari daerah ...",
            "Benda ini memiliki ... berwarna hitam dan putih.",
            "Lagu Lir ilir adalah lagu daerah yang berasal dari ....",
            "Alat musik ritmis yang dimainkan dengan cara dipukul adalah ....",
    };

    private  String mChoices[][] = {

            {"binatang", "pepohonan", "rumah", "jalan raya"},
            {"jawa", "bali", "sumatera barat", "aceh"},
            {"ragam hias", "bentuk", "tulisan", "bahan"},
            {"depok", "jakarta", "yogyakarta", "bogor"},
            {"tamborin", "kastanyet", "pianika", "sruling"},
    };

    private String mCorrectAnswer[] = {"pepohonan", "sumatera barat", "ragam hias", "yogyakarta", "tamborin"};

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
