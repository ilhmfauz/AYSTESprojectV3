package com.example.farishy.aystesprojectv3;

public class QuestionTIK4 {
    public String mQuestion[] ={
            "Pengguna komputer dinamakan dengan...",
            "Besar ukuran panjang dan lebar untuk kertas F4 adalah...",
            "Software terdiri dari sistem aplikasi dan sistem ..",
            "Yang termasuk output device adalah..",
            "data yang berupa angka pada awalnya akan diposisikan .. pada kotak cell",
    };

    private  String mChoices[][] = {

            {"Hardware", "Brainware", "Software", "Windows"},
            {"29 cm x 42 cm", "23 cm x 33 cm", "21.5 cm x 33 cm", "21.5 cm x 35cm   "},
            {"analisis", "produksi", "operasi", "software"},
            {"flashdisk", "mouse", "keyboard", "printer"},
            {"mana aja", "rata kiri", "rata kanan", "tengah"},
    };

    private String mCorrectAnswer[] = {"Brainware", "21.5 cm x 33 cm", "operasi", "printer", "rata kanan"};

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
