package com.example.examen_dias;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Act25 extends AppCompatActivity {
    boolean alt = false;
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act25);
        ImageView img = findViewById(R.id.img);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            img.setImageResource(alt ? R.drawable.ic_launcher_foreground : R.drawable.ic_launcher_background);
            alt = !alt;
        });
    }
}