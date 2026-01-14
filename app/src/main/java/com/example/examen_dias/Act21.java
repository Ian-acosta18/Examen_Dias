package com.example.examen_dias;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Act21 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act21);

        TextView txt = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            new CountDownTimer(30000, 1000) {
                public void onTick(long m) { txt.setText("" + m / 1000); }
                public void onFinish() { txt.setText("0"); }
            }.start();
        });
    }
}