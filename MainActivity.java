package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements useradabter.UserClickListener {

    RecyclerView rvusers;
    useradabter useradabter;
    List<username1> username1List = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvusers = findViewById(R.id.rvusers);
        setData();
        prepareRecyclerView();
    }
    public void setData(){
        username1List.add(new username1("raihan", "daffa","089519422533" ));
        username1List.add(new username1("budi", "tarmiji","081111111111" ));
        username1List.add(new username1("ryan", "armando","082222222222" ));
        username1List.add(new username1("beni", "beller","083333333333" ));

    }
    public void prepareRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvusers.setLayoutManager(linearLayoutManager);
        preadabter();

    }
    public  void preadabter(){
        useradabter = new useradabter(username1List,this, this ::selectedUser);
        rvusers.setAdapter(useradabter);
    }

    @Override
    public void selectedUser(username1 username1) {
//        Toast.makeText(this,"Selected user"+ username1.getNamadepan(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,SelectedUserActivity.class).putExtra("data",username1));
    }
}