package com.example.examen_dias;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Act20 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act20);

        TextView txt = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> txt.setText("Hola, Android"));
    }
}