package com.example.examen_dias;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Act28 extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        SQLiteDatabase db = openOrCreateDatabase("BD", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Usuarios(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, edad INTEGER)");
        db.execSQL("INSERT INTO Usuarios(nombre, edad) VALUES('Ian', 20)");
        finish();
    }
}