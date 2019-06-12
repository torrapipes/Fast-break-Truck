package domain.desayuno;

import interfaces.Item;

import java.util.ArrayList;

public class Desayuno {

    // Atributos
    private ArrayList<Item> desayunos = new ArrayList<Item>();

    public Desayuno(){
    }
    public ArrayList<Item> getDesayunos(){
        return this.desayunos;
    }

   public void mostrarItems(){
        for (Item item : this.getDesayunos()){
            System.out.println(item.toString());
        }
    }

    public Float getCoste(){
        Float precio = 0f;
        for (Item item : this.getDesayunos()){
            precio = precio + item.pvp();
        }
        return precio;
    }



}
