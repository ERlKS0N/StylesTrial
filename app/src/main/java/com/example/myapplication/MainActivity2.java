package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void changeGravity(View view){
        TextView textArea = findViewById(R.id.gravityChamber);
        ArrayList<Integer> gravities = new ArrayList<Integer>();
        gravities.add(Gravity.END);
        gravities.add(Gravity.FILL);
        gravities.add(Gravity.CENTER);
        gravities.add(Gravity.TOP);
        gravities.add(Gravity.BOTTOM);
        gravities.add(Gravity.CENTER_HORIZONTAL);
        gravities.add(Gravity.CENTER_VERTICAL);
        int gravity = (int)(Math.random() * 7);

        textArea.setGravity(gravities.get(gravity));
    }

}