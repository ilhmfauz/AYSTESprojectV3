package com.example.farishy.aystesprojectv3;

public class QuestionEN3 {
    public String mQuestion[] ={
            "Farwaw sleeps .... bed",
            "Ilham washes a plate in the ... ",
            "I take a bath in the ...",
            "When we are hot, we need",
            "....is sweet ",
    };

    private  String mChoices[][] = {

            {"beside", "on", "under", "in"},
            {"garage", "kitchen", "livingroom", "bathroom"},
            {"bathroom", "livingroom", "diningroom", "bedroom"},
            {"mirror", "fan", "icon", "blanket"},
            {"chili", "pepper", "sugar", "salt"},
    };

    private String mCorrectAnswer[] = {"on", "kitchen", "bathroom", "fan", "sugar"};

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
