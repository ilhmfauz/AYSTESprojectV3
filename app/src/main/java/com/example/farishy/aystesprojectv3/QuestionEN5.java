package com.example.farishy.aystesprojectv3;

public class QuestionEN5 {
    public String mQuestion[] ={
            "Rizaldi wants to eat a bar of ....",
            "Do you like potato chips? Yes, ...",
            "How many days are there in a month?",
            "How eo you ... the apple?",
            "Her house doesn't have backyard, ...?",
    };

    private  String mChoices[][] = {

            {"Pizza", "Fried Rice", "Chocolate", "Bread"},
            {"I am", "I Does", "I Don't", "I Do"},
            {"thirty of thirty one days", "twenty one days", "seven days", "twenty seven days"},
            {"peel", "knife", "spoon", "feel"},
            {"does it ", "doesn't it", "is it ", "do it"},
    };

    private String mCorrectAnswer[] = {"Chocolate", "I Do", "thirty of thirty one days", "peel", "doesn't it"};

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
