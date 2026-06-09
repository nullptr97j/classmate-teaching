package Ejercicios;

class Jugador {
    public String nombre;
    public static int puntaje = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void ganarPunto() {
        puntaje++;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Jugador carlos = new Jugador("Carlos");
        Jugador ana = new Jugador("Ana");

        carlos.ganarPunto();
        carlos.ganarPunto();
        ana.ganarPunto();

        System.out.println(carlos.nombre + " tiene: " + carlos.puntaje);
        System.out.println(ana.nombre + " tiene: " + ana.puntaje);
    }
    
}
