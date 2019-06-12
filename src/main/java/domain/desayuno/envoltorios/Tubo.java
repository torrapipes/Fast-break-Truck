package domain.desayuno.envoltorios;

import interfaces.Packing;

public class Tubo implements Packing {
    private String envoltorio = "tubo";

    public Tubo(){}

    public String envoltorio(){
        return this.envoltorio;
    }
}
