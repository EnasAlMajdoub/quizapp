package com.example.quizapp.Room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

 public interface QuizInterface extends DAO<QuizTable> {
    @Insert
    void createQuiz(QuizTable quizTable);

    @Update
    void updateQuiz(QuizTable quizTable);

    @Query("delete from quiz where id=:id")
    void deleteQuiz(int id);
    @Query("select * from quiz where quizName =:quizName")
    List<QuizTable> getQuiz(String quizName);
}
