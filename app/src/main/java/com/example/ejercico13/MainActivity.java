package com.example.ejercico13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercico13.configuracion.SQLiteConexion;
import com.example.ejercico13.tablas.Transacciones;

public class MainActivity extends AppCompatActivity {

    Button btnsalvar;
    EditText nombre, apellido, edad, correo, direccion;

    private void config(){
        nombre =(EditText) findViewById(R.id.nombre);
        apellido =(EditText) findViewById(R.id.apellido);
        edad =(EditText) findViewById(R.id.edad);
        correo =(EditText) findViewById(R.id.correo);
        direccion =(EditText) findViewById(R.id.direccion);
        btnsalvar = (Button) findViewById(R.id.salvar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config();

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salvar();

            }
        });
    }

    private void Salvar()
    {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDatabase, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombre, nombre.getText().toString());
        valores.put(Transacciones.apellido, apellido.getText().toString());
        valores.put(Transacciones.edad, edad.getText().toString());
        valores.put(Transacciones.correo, correo.getText().toString());

        Long resultado = db.insert(Transacciones.TbPersonas, Transacciones.id, valores);

        Toast.makeText(getApplicationContext(), "Registro Ingresado" + resultado.toString()
                , Toast.LENGTH_SHORT).show();

        db.close();

        ClearScreen();

    }

    private void ClearScreen()
    {
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        correo.setText("");
        direccion.setText("");
    }
}