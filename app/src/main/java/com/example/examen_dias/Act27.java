package com.example.examen_dias;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Act27 extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act27);
        EditText u = findViewById(R.id.u), p = findViewById(R.id.p);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            String res = (u.getText().toString().equals("admin") && p.getText().toString().equals("1234")) ? "Acceso permitido" : "Acceso denegado";
            Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
        });
    }
}