package com.example.android.go2gether;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class tutorialDriverActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_driver_2);
    }

    public void skipButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void nextButton(View view) {
        Intent intent = new Intent(this, tutorialDriverActivity_3.class);
        startActivity(intent);

    }
}
