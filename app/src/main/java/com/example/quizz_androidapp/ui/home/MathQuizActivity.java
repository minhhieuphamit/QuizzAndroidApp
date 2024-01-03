package com.example.quizz_androidapp.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizz_androidapp.R;

public class MathQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);
    }

    @Override
    protected void onStart() {
        super.onStart();
        goResult();
        backToPrevious();
    }

    private void backToPrevious(){
        findViewById(R.id.imageViewQuizMathTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void goResult(){
        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathQuizActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}