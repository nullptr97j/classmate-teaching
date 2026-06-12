package com.utp.utils;

import javax.swing.JOptionPane;

public class Ventana {
    private Ventana() {}

    public static void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrar(String mensaje, Object... args) {
        mostrar(String.format(mensaje, args));
    }

    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarError(String mensaje, Object... args) {
        mostrarError(String.format(mensaje, args));
    }

    public static String getString(String prompt) {
        String input = JOptionPane.showInputDialog(null, prompt);
        return (input == null) ? "" : input.trim();
    }

    public static int getInt(String prompt) {
        String input="";
        while (true) {
            try {
                input = getString(prompt);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                mostrarError(
                    "'%s' Es un número invalido, Por favor, introduce un número entero válido.",
                    input
                );
            }
        }
    }

    public static double getDouble(String prompt) {
        String input="";
        while (true) {
            try {
                input = getString(prompt);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                mostrarError(
                    "'%s' Es un número invalido, Por favor, introduce un número decimal válido.",
                    input
                );
            }
        }
    }
}