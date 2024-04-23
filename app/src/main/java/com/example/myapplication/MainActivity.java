package com.example.myapplication;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listviewID);

        name= getResources().getStringArray(R.array.playerList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.demo,R.id.textViewID, name);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value =name[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
                if(i==0)
                {
                    Intent intent=new Intent(MainActivity.this,messi.class);
                    startActivity(intent);
                }else if(i==1){
                    Intent intent=new Intent(MainActivity.this,messi.class);
                    startActivity(intent);
                }


            }

        });

    }
}