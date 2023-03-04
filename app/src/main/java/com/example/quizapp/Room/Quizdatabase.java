package com.example.quizapp.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {QuizTable.class} , version = 1)
public abstract class Quizdatabase extends RoomDatabase {

    public abstract QuizInterface getInterface();
    private static volatile Quizdatabase INSTANCE;

    public static Quizdatabase getInstance(Context context){
        if (INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context,Quizdatabase.class, "quiz")
                    .allowMainThreadQueries().fallbackToDestructiveMigration()
                    .build();

        }
        return INSTANCE;
    }
}
