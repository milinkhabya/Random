package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class second extends AppCompatActivity {
    TextView name;

    List<String> names = Arrays.asList("Milin", "Ram", "Shyam", "Mukesh");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (TextView) findViewById(R.id.random);
        Random rand = new Random();
        String randomName = names.get(rand.nextInt(names.size()));
        name.setText(randomName);
    }
}