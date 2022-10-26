package com.example.ejercico13.configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ejercico13.tablas.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper
{
    //constructor de clase para la basa de datos
    public SQLiteConexion(Context context,
                          String dbname,
                          SQLiteDatabase.CursorFactory factory,
                          int version)
    {
       super(context, dbname, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
       // creacion de la base de db
        db.execSQL(Transacciones.CTPersonas);//creacion de la tabla persona
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        //eliminamos la data y las tablas de la aplicacion
        db.execSQL(Transacciones.DropTPersona);
        onCreate(db);

    }
}
