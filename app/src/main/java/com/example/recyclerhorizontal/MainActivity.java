package com.example.recyclerhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.recyclerhorizontal.LayoutManager.ScaleCenterItemLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv1;
    RecyclerView rv2;
    ArrayList<Skin> dataSource;
    ScaleCenterItemLayoutManager linearLayoutManager;
    AdapterSkin adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv1 = findViewById(R.id.horizontalRv);
        rv2 = findViewById(R.id.horizontalRv2);

        //First recycler
        dataSource = new ArrayList<>();
        dataSource.add(new Skin("First", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Luffy", R.drawable.luffy_xd));
        dataSource.add(new Skin("Third", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("xd", R.drawable.ic_launcher_background));

        linearLayoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        adapter = new AdapterSkin(dataSource);
        rv1.setLayoutManager(linearLayoutManager);
        rv1.setAdapter(adapter);


        //Second recycler
        dataSource = new ArrayList<>();
        dataSource.add(new Skin("1",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("2",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("3",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Luffy",R.drawable.luffy_xd));
        dataSource.add(new Skin("5",R.drawable.ic_launcher_background));

        linearLayoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        adapter = new AdapterSkin(dataSource);
        rv2.setLayoutManager(linearLayoutManager);
        rv2.setAdapter(adapter);
    }
}