package com.example.examen_dias;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.net.HttpURLConnection;
import java.net.URL;

public class Act29 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        new Thread(() -> {
            try {
                URL url = new URL("https://jsonplaceholder.typicode.com/posts");
                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setRequestMethod("GET");
                int responseCode = c.getResponseCode(); // Esto dispara la conexión
                c.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        finish();
    }
}