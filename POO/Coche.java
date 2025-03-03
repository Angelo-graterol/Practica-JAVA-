package POO;

public class Coche {
    private String marca;
    private String modelo;
    private int year;
    private int velocidad;

    //constructor
    public Coche(String marca, String modelo, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidad = 0;
    }

    //getters
    public String getMarca(){ return marca;}
    public String getModelo(){ return modelo;}
    public int getYear(){ return year;}
    public int getVelocidad(){ return velocidad;}

    //setters
    public void setYear(int year){
        if (year > 1886) {
            this.year = year;
            
        }
    }

    public void acelerar(int incremento){
        if (incremento > 0){
            this.velocidad += incremento;
            System.out.println("Acelerando... Velocidad actual: \" + velocidad + \" km/h");
        } else {
            System.out.println("Error: Incremento debe ser positivo");
        }
    }
}
