package com.utp.streaming;

class PlanEstandar extends Plan {
    public PlanEstandar(String nombreUsuario) {
        super(nombreUsuario, 10.0);
    }

    @Override
    public double calcularFactura() {
        return getPrecioBase();
    }
}