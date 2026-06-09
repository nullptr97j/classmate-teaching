package Utilidades;
import java.util.ArrayList;
import java.util.List;

abstract class Heroe {
    private String nombre;
    private int vida;

    public Heroe(String nombre, int vidaInicial) {
        this.nombre = nombre;
        this.vida = vidaInicial;
    }

    // Encapsulacion
    public String getNombre() { return nombre; }
    
    public int getVida() { return vida; }
    
    public void setVida(int vida) { this.vida = vida; }

    // Capabilidades todo heroe debe de tener
    public abstract void atacar();
    public abstract void subirNivel();
}

class Guerrero extends Heroe {
    private double pesoArmadura;
    private boolean tieneEscudo;

    public Guerrero(String nombre) {
        super(nombre, 150);
        this.pesoArmadura = 25.5;
        this.tieneEscudo = true;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " blande la espada causando 50 de daño!");
    }

    @Override
    public void subirNivel() {
        setVida(getVida() + 20);
        System.out.println(getNombre() + " subió de nivel! Vida actual: " + getVida());
    }

    public void usarEscudo() {
        System.out.println(getNombre() + " se defiende con el escudo.");
    }
}

class Mago extends Heroe {
    private int mana;
    private double poderHechizo;

    public Mago(String nombre) {
        super(nombre, 80);
        this.mana = 200;
        this.poderHechizo = 50.0;
    }

    @Override
    public void atacar() {
        if (this.mana >= 20) {
            this.mana -= 20;
            System.out.println(getNombre() + " lanza bola de fuego! Maná restante: " + this.mana);
        } else {
            System.out.println(getNombre() + " no tiene suficiente maná.");
        }
    }

    @Override
    public void subirNivel() {
        setVida(getVida() + 10);
        this.mana += 50;
        System.out.println(getNombre() + " subió de nivel! Maná actual: " + this.mana);
    }
}

class Nigromante extends Heroe {
    private int almasRecolectadas;
    private int limiteEsqueletos;

    public Nigromante(String nombre) {
        super(nombre, 100);
        this.almasRecolectadas = 0;
        this.limiteEsqueletos = 5;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " invoca esqueletos. Almas actuales: " + almasRecolectadas);
    }

    @Override
    public void subirNivel() {
        setVida(getVida() + 15);
        this.limiteEsqueletos += 2;
        System.out.println(getNombre() + " subió de nivel! Límite de esqueletos: " + this.limiteEsqueletos);
    }
}

public class Utilidad1 {
    public static void main(String[] args) {
        List<Heroe> party = new ArrayList<>();
        
        party.add(new Guerrero("Conan"));
        party.add(new Mago("Veigar"));
        party.add(new Nigromante("Malakor"));

        System.out.println("--- FASE DE ATAQUE ---");
        for (Heroe h : party) {
            h.atacar();
        }

        System.out.println("\n--- FASE DE SUBIR NIVEL ---");
        for (Heroe h : party) {
            h.subirNivel();
        }
    }
    
}
