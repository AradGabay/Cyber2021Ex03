package com.example.aradg.cyber2021ex03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int i;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=0;
        btn=(Button)findViewById(R.id.btnclick3);
    }

    public void onClick(View view) {
        i++;
        btn.setText("This is click number:"+i);
        if(i==6){
            btn.setText("Enough clicking. Go to new start");
            i=0;
        }
    }
}
