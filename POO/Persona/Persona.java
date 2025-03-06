package POO.Persona;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola");
    }
}
