package com.example.ejercico13.tablas;

public class Transacciones {
    //creamos la base de datos
    public static final String NameDatabase ="Ejercicio1.3";

    /*Creacion de las tabla de la bd*/
    public static final String TbPersonas ="personas";

    /*campos de la tabla persona*/
    public static final String id= "id";
    public static final String nombre= "nombre";
    public static final String apellido= "apellido";
    public static final String edad= "edad";
    public static final String correo= "correo";
    public static final String direccion= "direccion";

    //DDL
    public static final String CTPersonas ="CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT," +
            " nombre TEXT, apellido TEXT, edad INTEGER, carreo TEXT, direccion TEXT)";

    public static String GetPersonas = "SELECT * FROM " + Transacciones.TbPersonas;

    public static String DropTPersona = "DROP TABLE IF EXISTS personas";

}
