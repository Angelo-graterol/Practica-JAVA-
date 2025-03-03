package POO;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Velocidad inicial: " + miCoche.getVelocidad());
        
        miCoche.acelerar(30); // Acelera 30 km/h
        miCoche.acelerar(20); // Acelera 20 km/h más
        miCoche.acelerar(-5); // Error: Incremento no válido
        
        System.out.println("Velocidad final: " + miCoche.getVelocidad());
    }
}
