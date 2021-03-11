package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView classScheduleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classScheduleListView = findViewById(R.id.class_schedule);
        String[] classes = {"CSCI 370","CSCI 392","CSCI 462","HPCP 199","ANTH 101","CSCI 340","CSCI 362","CSCI 380"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,classes);
        classScheduleListView.setAdapter(adapter);

        classScheduleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String s = (String) adapterView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });

        classScheduleListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                String s = (String) adapterView.getItemAtPosition(position)+" Long Click";
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}