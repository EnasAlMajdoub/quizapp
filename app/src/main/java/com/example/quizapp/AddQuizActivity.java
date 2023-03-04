package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.quizapp.Room.QuizInterface;
import com.example.quizapp.Room.QuizTable;
import com.example.quizapp.Room.Quizdatabase;
import com.example.quizapp.databinding.ActivityAddQuizBinding;

public class AddQuizActivity extends AppCompatActivity {

   ActivityAddQuizBinding binding;
   Quizdatabase quizdatabase;
   QuizInterface quizInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        quizdatabase = Quizdatabase.getInstance(this);
        quizInterface = quizdatabase.getInterface();

        binding.createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quizName = binding.quizName.getText().toString();
                String quesion = binding.question.getText().toString();
                String choice1 = binding.ch1.getText().toString();
                String choice2 = binding.ch2.getText().toString();
                String choice3 = binding.ch3.getText().toString();
                String choice4 = binding.ch4.getText().toString();
                String correct = binding.correctOne.getText().toString();

                if (correct.equals("a")){
                    correct=choice1;
                }if (correct.equals("b")){
                    correct=choice2;
                }if (correct.equals("c")){
                    correct=choice3;
                }if (correct.equals("d")){
                    correct=choice4;
                }



                QuizTable quizTable = new QuizTable(0,quizName, quesion, choice1, choice2,choice3,choice4,correct);

                quizInterface.createQuiz(quizTable);


            }
        });
    }
}