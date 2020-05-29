package com.example.lab4android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lab4android.Fragments.SecondTaskFragment;
import com.example.lab4android.Fragments.ThirdTaskFragment;


public class MainActivity extends AppCompatActivity implements ThirdTaskFragment.startThirdActivity, SecondTaskFragment.startSecondActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void startSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void startThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}
