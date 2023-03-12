package com.example.formulario;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.formulario.db.DbHelper;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.creardb);
        button.setOnClickListener(v -> {
            // Do something in response to button click

            DbHelper dbhelper =new DbHelper(MainActivity.this);
            SQLiteDatabase db= dbhelper.getWritableDatabase();
            if(db != null){
                Toast.makeText(MainActivity.this,"base de datos cleada",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(MainActivity.this,"base de datos no cleada",Toast.LENGTH_LONG).show();
            }
        });
    }
}