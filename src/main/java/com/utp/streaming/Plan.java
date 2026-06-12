package com.utp.streaming;

public abstract class Plan {
    private String nombreUsuario;
    private double precioBase;

    public Plan(String nombreUsuario, double precioBase) {
        this.nombreUsuario = nombreUsuario;
        this.precioBase = precioBase;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public double getPrecioBase() { return precioBase; }

    public abstract double calcularFactura();
}