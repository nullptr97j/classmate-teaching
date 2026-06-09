package Ejercicios;

interface Conducible {
    void conducir();
}

class Auto implements Conducible {
    @Override
    public void conducir() {
        System.out.println("El auto avanza por la carretera.");
    }

    public void encenderAire() {
        System.out.println("Enciendo el aire acondicionado.");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Conducible miVehiculo = new Auto();
        miVehiculo.conducir();
        //miVehiculo.encenderAire();
    }
    
}
