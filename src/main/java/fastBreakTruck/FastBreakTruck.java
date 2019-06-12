package fastBreakTruck;

import domain.desayuno.Desayuno;
import domain.desayuno.bebida.FleebJuice;
import domain.desayuno.bebida.TurbulentJuice;
import domain.desayuno.cereales.Eyeholes;
import domain.desayuno.cereales.Smiggles;
import domain.desayuno.juguetes.Plumbus;
import interfaces.Item;

public class FastBreakTruck {


    public FastBreakTruck(){

    }

    public static Desayuno prepararEyeHoles(){
        Item eyeholes = new Eyeholes();
        Item turbulentJuice = new TurbulentJuice();
        Desayuno desayuno = new Desayuno();
        desayuno.getDesayunos().add(eyeholes);
        desayuno.getDesayunos().add(turbulentJuice);

        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Item smiggles = new Smiggles();
        Item fleebJuice = new FleebJuice();
        Desayuno desayuno = new Desayuno();
        desayuno.getDesayunos().add(smiggles);
        desayuno.getDesayunos().add(fleebJuice);


        return desayuno;
    }

    public static void incluirJuguete(Desayuno des){

        Plumbus plumbus = new Plumbus();
        des.getDesayunos().add(plumbus);

    }
}
