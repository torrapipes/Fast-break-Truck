package domain.desayuno.cereales;

public class Eyeholes extends Cereales {

    private String NOMBRE = "Eyeholes";
    private Float PVP = 25.0f;


    public Eyeholes(){}

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }

    public String toString(){
        return this.NOMBRE + "Empaquetado: " + super.toString() + "Precio: " + this.pvp();
    }








}
