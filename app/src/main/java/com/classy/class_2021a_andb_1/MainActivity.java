package com.classy.class_2021a_andb_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton main_BTN_clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main_BTN_clickMe = findViewById(R.id.main_BTN_clickMe);
        main_BTN_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySignal.getInstance().toast("Clicked!");
            }
        });


    }

}