package domain.desayuno.bebida;

public class FleebJuice extends Bebida {


    private String NOMBRE = "FleebJuice";
    private Float PVP = 35.0f;

    public FleebJuice(){

    }

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }


}
