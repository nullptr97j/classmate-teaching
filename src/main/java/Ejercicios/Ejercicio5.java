package Ejercicios;

interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    public void volar() { System.out.println("El pato vuela bajo."); }
    public void nadar() { System.out.println("El pato nada en el estanque."); }
}


public class Ejercicio5 {
    public static void main(String[] args) {
        Pato lucas = new Pato();
        Volador ave = lucas;
        Nadador pez = lucas;

        ave.volar();
        // ave.nadar();

        pez.nadar();
        // pez.volar();
    }
}
