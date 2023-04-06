package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SelectedUserActivity extends AppCompatActivity {

    TextView tvSelectedUserName;
    username1 username1;
    Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_user);
        tvSelectedUserName = findViewById(R.id.tvSelectedUserName);
        intent = getIntent();

        if(intent !=null){
            username1 = (username1) intent.getSerializableExtra("data");
            String username = username1.getNamadepan() +" "+ username1.getNamabelakang();
            tvSelectedUserName.setText(username);
        }
    }
}