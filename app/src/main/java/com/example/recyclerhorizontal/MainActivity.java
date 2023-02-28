package com.example.recyclerhorizontal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Skin> dataSource;
    LinearLayoutManager linearLayoutManager;
    AdapterSkin adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.horizontalRv);
        dataSource = new ArrayList<>();
        dataSource.add(new Skin("Hola", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Luffy", R.drawable.luffy_xd));
        dataSource.add(new Skin("Hola", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Hola", R.drawable.ic_launcher_background));

        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        adapter = new AdapterSkin(dataSource);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapter);
    }
}