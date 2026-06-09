package com.utp.clase1;

public class Persona {
    String nombre, celular, identificacion;
    int edad;

    public Persona(
        String nombre,
        String celular,
        String identificacion,
        int edad
    ) {
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\n" +
                "Identificacion: " + identificacion + "\n" +
                "Celular: " + celular + "\n" +
                "Edad: " + edad + "\n";
    }
}
