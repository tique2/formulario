package com.example.formulario.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATAVASE_VERSION=1;
    private static final String DATAVASE_NAME="empresa.db";
    public static final String DATAVASE_TABLE="producto";
    public DbHelper(@Nullable Context context) {
        super(context, DATAVASE_NAME, null, DATAVASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase Basededatos) {
        Basededatos.execSQL("create table "+DATAVASE_TABLE+"(" +
                "id integer primary key autoincrement," +
                "nombre text not null," +
                "cantidad text not null," +
                "precio text not null)");
    }
    public void insertar(SQLiteDatabase inserta){
        inserta.execSQL("Insert into "+DATAVASE_TABLE);
        insertar(inserta);
    }
    public void guardar(SQLiteDatabase guarda){
        guarda.execSQL("UPDATE "+DATAVASE_TABLE);
        guardar(guarda);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table "+DATAVASE_TABLE);
        onCreate(sqLiteDatabase);
    }
}