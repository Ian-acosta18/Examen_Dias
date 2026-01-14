package com.example.examen_dias;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.net.HttpURLConnection;
import java.net.URL;

public class Act29 extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        new Thread(() -> {
            try {
                HttpURLConnection c = (HttpURLConnection) new URL("https://jsonplaceholder.typicode.com/posts").openConnection();
                c.setRequestMethod("GET");
                c.getResponseCode();
                c.disconnect();
            } catch (Exception e) { e.printStackTrace(); }
        }).start();
        finish();
    }
}