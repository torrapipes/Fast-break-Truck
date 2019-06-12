package domain.desayuno.cereales;

public class Smiggles extends Cereales {

    private String NOMBRE = "Smiggles";
    private Float PVP = 50.0f;


    public Smiggles(){
    }

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }


}
