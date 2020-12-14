package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTrain, btnSeat, btnPass, btnCoach, btnCoachNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        loadInteractions();
    }

    private void loadInteractions(){
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrainActivity.class));
            }
        });

        btnSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SeatActivity.class));
            }
        });

        btnPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PassengerActivity.class));
            }
        });

        btnCoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CoachActivity.class));
            }
        });

        btnCoachNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CoachNumberActivity.class));
            }
        });
    }

    private void initViews(){
        btnTrain = findViewById(R.id.btn_trn);
        btnSeat = findViewById(R.id.btn_seat);
        btnPass = findViewById(R.id.btn_pass);
        btnCoach = findViewById(R.id.btn_coach);
        btnCoachNum = findViewById(R.id.btn_coach_num);
    }
}