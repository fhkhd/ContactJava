package com.example.contactsjava.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "ContactsDB.db";
    private static final int version = 1;
    Context context;

    public DataBase (Context context){
        super(context , DB_NAME , null , version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String cQuery = "CREATE TABLE Contacts (cID INTEGER PRIMARY KEY AUTOINCREMENT , name TEXT , phone VARCHAR , image INTEGER);";
            db.execSQL(cQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
