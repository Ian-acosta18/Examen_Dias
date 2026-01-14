package com.example.examen_dias;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Act26 extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        NotificationManager nm = getSystemService(NotificationManager.class);
        NotificationChannel c = new NotificationChannel("c", "Canal", NotificationManager.IMPORTANCE_DEFAULT);
        nm.createNotificationChannel(c);
        nm.notify(1, new Notification.Builder(this, "c")
                .setContentText("Tienes una nueva alerta")
                .setSmallIcon(R.drawable.ic_launcher_foreground).build());
        finish();
    }
}