package com.ivan.actividad2.actividad2.entities;

public class Coche {

    String matricula;
    String marca;
    String modelo;
    Integer km;

    public Coche(String matricula, String marca, String modelo, Integer km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Coche:" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                '}';
    }
}
