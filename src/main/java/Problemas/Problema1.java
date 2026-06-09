package Problemas;

class Heroe {
    public String nombre;
    public String tipo; // "Guerrero", "Mago", "Nigromante"
    public int vida;

    // Esto solo pertenece a guerrero
    public double pesoArmadura;
    public boolean tieneEscudo;

    // Esto solo pertenece a mago
    public int mana;
    public double poderHechizo;

    // Esto solo pertenece a nigromante
    public int almasRecolectadas;
    public int limiteEsqueletos;

    public Heroe(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        
        if (tipo.equals("Guerrero")) {
            this.vida = 150;
            this.tieneEscudo = true;
        } else if (tipo.equals("Mago")) {
            this.vida = 80;
            this.mana = 200;
        } else if (tipo.equals("Nigromante")) {
            this.vida = 100;
            this.limiteEsqueletos = 5;
        }
    }

    public void atacar() {
        if (tipo.equals("Guerrero")) {
            System.out.println(nombre + " blande la espada causando 50 de daño!");
        } else if (tipo.equals("Mago")) {
            if (this.mana >= 20) {
                this.mana -= 20;
                System.out.println(nombre + " lanza bola de fuego! Mana restante: " + this.mana);
            } else {
                System.out.println("No hay mana");
            }
        } else if (tipo.equals("Nigromante")) {
            System.out.println(nombre + " invoca esqueletos. Almas actuales: " + almasRecolectadas);
        }
    }

    public void subirNivel() {
        this.vida += 20;
        if (tipo.equals("Mago")) {
            this.mana += 50;
        } else if (tipo.equals("Nigromante")) {
            this.limiteEsqueletos += 2;
        }
    }

    public void equiparItem(String item) {
        if (tipo.equals("Guerrero") && item.contains("Escudo")) {
            this.tieneEscudo = true;
        } else if (tipo.equals("Mago") && item.contains("Báculo")) {
            this.poderHechizo += 15;
        } else {
            System.out.println("Este héroe no puede equipar este item.");
        }
    }
}
public class Problema1 {}
