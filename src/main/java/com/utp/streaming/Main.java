package com.utp.streaming;

import com.utp.utils.Ventana;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plan> suscripciones = new ArrayList<>();
        int opcion;

        final int OPCION_SALIR = 3;
        do {
            opcion = Ventana.getInt(
                """
                --- Registro de Streaming ---
                Elija su tipo de plan:
                1.- Estandard
                2.- Premium
                3.- Salir
                """
            );

            switch (opcion) {
                case 1:
                    suscripciones.add(
                        new PlanEstandar(
                            Ventana.getString("Ingrese nombre de usuario para Plan Standard:")
                        )
                    );
                break;

                case 2:
                    String nombreDeUsuario = Ventana.getString("Ingrese nombre de usuario para Plan Premium:");
                    String respuesta4k = Ventana.getString("¿Desea calidad 4K? (si / no):");

                    suscripciones.add(
                        new PlanPremium(
                            nombreDeUsuario,
                            respuesta4k.equalsIgnoreCase("si")
                        )
                    );
                break;

                case 3:
                    continue;
            
                default:
                    Ventana.mostrarError(
                        "La opcion '%d' es invalida. Intentelo nuevamente.",
                        opcion
                    );
                break;
            }

            Ventana.mostrar("Usuario agregado exitosamente.");
        } while (opcion != OPCION_SALIR);
        
        String reporte = "REPORTE MENSUAL DE COBROS\n====================\n";
        for (Plan p : suscripciones) {
            reporte += "Usuario: " + p.getNombreUsuario() + "\n" +
                       "Total a Pagar: $" + p.calcularFactura() + "\n-----------------------------------------------\n";
        }

        Ventana.mostrar(reporte);
    }
}