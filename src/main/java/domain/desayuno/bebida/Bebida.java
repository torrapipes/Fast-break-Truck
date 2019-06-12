package domain.desayuno.bebida;

import domain.desayuno.envoltorios.Tubo;
import interfaces.Item;
import interfaces.Packing;

abstract class Bebida implements Item {

    private String envoltorio = "tubo";
    Tubo tubo = new Tubo();

    public Packing empaquetado(){
        return tubo;
    }

    public String envoltorio(){
        return envoltorio;
    }
}
