package com.example.egzaminmobilne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Button btn1 = findViewById(R.id.btn1);

        EditText text1 = findViewById(R.id.text1);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Zakupy: chleb, masło, ser"));
        items.add(new Item("Do zrobienia: obiad, umyć podłogi"));
        items.add(new Item("weekend: kino, spacer z psem"));
        MyAdapter adapter = new MyAdapter(getApplicationContext(),items);



        btn1.setOnClickListener(new View.OnClickListener() {
            private Context getActivity;

            @Override
            public void onClick(View v) {
                String text = String.valueOf(text1.getText());
                items.add(new Item(text));
                adapter.notifyItemInserted(items.size());

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}