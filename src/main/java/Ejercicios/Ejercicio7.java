package Ejercicios;

class Superheroe {
    public String identidad = "Civil Incógnito";
    
    public void presentarse() {
        System.out.println("Soy un protector de la ciudad.");
    }
}

class Batman extends Superheroe {
    public String identidad = "Bruce Wayne"; // ¡Mismo nombre de variable!

    @Override
    public void presentarse() {
        System.out.println("¡Soy Batman!");
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Superheroe heroe = new Batman();

        System.out.println("Identidad: " + heroe.identidad);
        heroe.presentarse();
    }
}
