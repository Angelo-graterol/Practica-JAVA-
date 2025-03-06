package POO.Persona;

public class Estudiante extends Persona {
    
    private String curso;

    public Estudiante(String nombre, int edad, String curso){
        super(nombre,edad);
        this.curso = curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    
}
