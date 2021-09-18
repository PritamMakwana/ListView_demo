package com.wallpy.listview_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String language[]={"C","C++","python","html","javascript","css","php",
            "C","C++","python","html","javascript","css","php",
            "C","C++","python","html","javascript","css","php",
            "C","C++","python","html","javascript","css","php"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        listView=findViewById(R.id.lv);
        textView=findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item,language);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Your select "+language[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}