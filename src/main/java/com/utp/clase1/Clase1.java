package com.utp.clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        
        do {
            String menu = """
                          INGRESO DEL PERSONAL
                          1. Trabajador
                          2. Proveedor
                          3. Salir
                          """;
            
            System.out.println(menu);
            
            opcion = ingreso.nextInt();
            ingreso.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = ingreso.nextLine();
                    System.out.println("Celular: ");
                    String celular = ingreso.nextLine();
                    System.out.println("DNI: ");
                    String dni = ingreso.nextLine();
                    System.out.println("Edad: ");
                    int edad = ingreso.nextInt();
                    ingreso.nextLine();
                    System.out.println("Sueldo: ");
                    double sueldo = ingreso.nextDouble();
                    
                    Trabajador tr = new Trabajador(sueldo, nombre, celular, dni, edad);
                    System.out.println(tr.mostrarInformacion());
                break;
                
                case 2:
                    System.out.println("Nombre: ");
                    String nombre2 = ingreso.nextLine();
                    System.out.println("Celular: ");
                    String celular2 = ingreso.nextLine();
                    System.out.println("DNI: ");
                    String dni2 = ingreso.nextLine();
                    System.out.println("Edad: ");
                    int edad2 = ingreso.nextInt();
                    ingreso.nextLine();
                    System.out.println("Empresa: ");
                    String empresa = ingreso.nextLine();
                    
                    Proveedor pr = new Proveedor(empresa, nombre2, celular2, dni2, edad2);
                    System.out.println(pr.mostrarInformacion());
                break;
                
                case 3:
                    System.exit(0);
            }
            
        } while (true);
    }
}
