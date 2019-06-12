package domain.desayuno.bebida;


public class TurbulentJuice extends Bebida {


    private String NOMBRE = "Turbulent Juuuuuice";
    private Float PVP = 30.0f;

    public TurbulentJuice(){}

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }
}
