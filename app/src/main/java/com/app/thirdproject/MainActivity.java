package com.app.thirdproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    Button btn;
    ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        btn = findViewById(R.id.btn);
        list = findViewById(R.id.list);


        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.n, names);

        list.setAdapter(adapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = Name.getText().toString();
                Name.setText("");
              //   names.add(b);
               adapter.add(b);
            }
        });
    }
}
