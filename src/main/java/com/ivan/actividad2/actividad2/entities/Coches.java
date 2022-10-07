package com.ivan.actividad2.actividad2.entities;

import java.util.List;

public interface Coches {
        List < Coche > mostrar();
        Coche añadir(Coche coche);

        Coche buscar(String matricula);
}


