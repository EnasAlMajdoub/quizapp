package com.example.quizapp.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quiz")
public class QuizTable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String quizName;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOne;

    public  QuizTable(int i, String quizName, String quesion, String choice1, String choice2, String choice3, String choice4, String correct) {

    }

    public  QuizTable(int id, String quizName, String question, String optionA,String optionB,String optionC,String optionD) {
        this.id = id;
        this.quizName = quizName;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOne = correctOne;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getCorrectOne() {
        return correctOne;
    }

    public void setCorrectOne(String correctOne) {
        this.correctOne = correctOne;
    }
}
