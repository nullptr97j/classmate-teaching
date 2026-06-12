package com.utp.streaming;

class PlanPremium extends Plan {
    private boolean incluye4K;

    public PlanPremium(String nombreUsuario, boolean incluye4k) {
        super(nombreUsuario, 15.0);
        this.incluye4K = incluye4k;
    }

    @Override
    public double calcularFactura() {
        if (incluye4K) {
            return getPrecioBase() + 5.0;
        }
        return getPrecioBase();
    }
}