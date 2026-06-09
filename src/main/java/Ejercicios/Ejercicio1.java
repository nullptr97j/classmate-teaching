package Ejercicios;

abstract class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico...");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}

public class Ejercicio1 {
    public static void main(String args[]) {
        Animal miMascota = new Perro();
        miMascota.hacerSonido();

        Animal misterioso = new Gato();
        misterioso = new Perro();
        misterioso.hacerSonido();
    }
}
