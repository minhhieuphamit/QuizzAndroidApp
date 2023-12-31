package com.example.quizz_androidapp.ui.home.math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quizz_androidapp.R;

public class ResultMathActivity extends AppCompatActivity {
    TextView subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initView();
    }

    public void initView(){
        subject = findViewById(R.id.textView16);
    }

    @Override
    protected void onStart() {
        super.onStart();
        backToMain();
        backToPrevious();
    }

    private void backToPrevious(){
        findViewById(R.id.imageViewFinalResultQuiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void backToMain(){
        findViewById(R.id.btnFinishQuiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}