package com.example.examen_dias;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] opciones = {
            "20 TextView", "21 CountDown", "22 Saludo", "23 Recycler",
            "24 Acelerómetro", "25 Imagen", "26 Notificación",
            "27 Login", "28 SQLite", "29 REST"
    };

    Class<?>[] acts = {
            Act20.class, Act21.class, Act22.class, Act23.class,
            Act24.class, Act25.class, Act26.class,
            Act27.class, Act28.class, Act29.class
    };

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.listMenu);
        list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones));

        list.setOnItemClickListener((a, v, i, l) -> startActivity(new Intent(this, acts[i])));
    }
}