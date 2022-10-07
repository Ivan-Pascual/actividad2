package com.ivan.actividad2.actividad2.entities;

import java.util.ArrayList;
import java.util.List;

public class CochesRam implements Coches {
    List<Coche> coches = new ArrayList<>();

    public CochesRam() {
        this.coches = coches;
    }

    @Override
    public List<Coche> mostrar() {
        return this.coches;
    }

    @Override
    public Coche añadir(Coche coche) {
        System.out.println(coche);
        coches.add(coche);
        return coche;
    }


    @Override
    public Coche buscar(String matricula) {
        for (int i = 0 ; i < coches.size();i++){
            Coche actual = coches.get(i);
            if(matricula.equals(actual.getMatricula())){
                return actual;
            }
        }
        return null;

    }



}
