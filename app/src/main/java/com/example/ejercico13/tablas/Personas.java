package com.example.ejercico13.tablas;

class Personas{
    public Integer id;
    public String nombre;
    public String apellido;
    public String direccion;

    // constructor de clases

    public Personas(Integer id, String nombre, String apellido, Integer edad, String correo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Personas(){
        //TODO

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return correo;
    }

    public void setDireccion(String direccion) {
        this.correo = direccion;
    }

    public Integer edad;
    public String correo;

}
