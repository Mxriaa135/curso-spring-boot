package com.curso_spring_boot.Arquiteturaspring.Montadora;

import java.awt.*;

public class Carro{
    private String modelo;
    private Color color;
    private Montadora montadora;
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
