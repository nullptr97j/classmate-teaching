package com.utp.clase1;

public class Trabajador extends Persona {
    double sueldo;

    public Trabajador(double sueldo, String nombre, String celular, String identificacion, int edad) {
        super(nombre, celular, identificacion, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String mostrarInformacion() {
        return "TRABAJADOR\n"
                +"====================\n"
                + super.mostrarInformacion()
                + "Sueldo: " + sueldo + "\n";
    }
}
