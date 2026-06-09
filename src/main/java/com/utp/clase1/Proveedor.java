package com.utp.clase1;

public class Proveedor extends Persona {
    private String empresa;

    public Proveedor(String empresa, String nombre, String celular, String identificacion, int edad) {
        super(nombre, celular, identificacion, edad);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String mostrarInformacion() {
        return "PROVEEDOR\n"
                +"====================\n"
                + super.mostrarInformacion()
                + "empresa: " + empresa + "\n";
    }
}
