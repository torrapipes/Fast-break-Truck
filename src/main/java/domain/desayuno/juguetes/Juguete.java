package domain.desayuno.juguetes;

import domain.desayuno.envoltorios.Caja;
import interfaces.Item;
import interfaces.Packing;

abstract class Juguete implements Item {

    Caja caja = new Caja();

    public Packing empaquetado(){
        return caja;
    }

    public String toString(){
        return caja.toString();
    }
}
