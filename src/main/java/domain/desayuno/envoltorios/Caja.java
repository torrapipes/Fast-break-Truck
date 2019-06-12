package domain.desayuno.envoltorios;

import interfaces.Packing;

public class Caja implements Packing {

    private String envoltorio = "caja";

    public Caja(){}

    public String envoltorio(){
        return this.envoltorio;
    }
}
