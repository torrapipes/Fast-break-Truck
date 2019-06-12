package domain.desayuno.juguetes;

public class Plumbus extends Juguete {

    private String NOMBRE = "Plumbus";
    private Float PVP = 100.0f;

    public Plumbus(){}

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }

    public String toString(){
        return "Item: " + this.NOMBRE + ", Empaquetado: " + super.toString() + ", Precio: " + this.pvp();
    }

}
