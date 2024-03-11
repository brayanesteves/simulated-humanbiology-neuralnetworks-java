package com.halconbit.simulated.humanbiology.neuralnetworks.java.cell;

import com.halconbit.simulated.humanbiology.neuralnetworks.java.neural.PerceptronMulticapa;

public class Linfocito {

    private String tipo;
    private boolean activado;
    private PerceptronMulticapa perceptron;

    public Linfocito(String tipo, int numEntradas, int numNeuronasCapaOculta) {
        this.tipo = tipo;
        this.activado = false;
        this.perceptron = new PerceptronMulticapa(numEntradas, numNeuronasCapaOculta);
    }

    public void activar() {
        this.activado = true;
        System.out.println("Linfocito " + tipo + " activado.");
    }

    public void desactivar() {
        this.activado = false;
        System.out.println("Linfocito " + tipo + " desactivado.");
    }

    public boolean estaActivado() {
        return activado;
    }

    public void tomarDecision(double[] entradas) {
        perceptron.feedForward(entradas);
        double decision = perceptron.getSalidaRed();
        System.out.println("El linfocito " + tipo + " ha tomado la decisión: " + decision);
    }

}