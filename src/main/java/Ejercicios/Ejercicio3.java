/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

class Producto {
    public String nombre;
    public double precio;

    public Producto(String nombre, double precio) {
        nombre = nombre; 
        precio = precio;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 800.0);
        System.out.println("Producto: " + p.nombre + " | Precio: " + p.precio);
    }
    
}
