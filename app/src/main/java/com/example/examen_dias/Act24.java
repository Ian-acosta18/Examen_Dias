package com.example.examen_dias;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Act24 extends AppCompatActivity implements SensorEventListener {
    TextView txt;
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_act24);
        txt = findViewById(R.id.txt);
        SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        sm.registerListener(this, sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }
    public void onSensorChanged(SensorEvent e) {
        txt.setText("X:" + e.values[0] + "\nY:" + e.values[1] + "\nZ:" + e.values[2]);
    }
    public void onAccuracyChanged(Sensor s, int a) {}
}