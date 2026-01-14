package com.example.examen_dias;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Act22 extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act22);
        EditText edt = findViewById(R.id.edt);
        TextView txt = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> txt.setText("Hola " + edt.getText().toString()));
    }
}