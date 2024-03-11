package com.halconbit.simulated.humanbiology.neuralnetworks.java;

import com.halconbit.simulated.humanbiology.neuralnetworks.java.cell.Linfocito;

/**
 * @author Brayan Esteves - Venezuela (brayan.esteves93@gmail.com)
 */
public class SimulatedHumanbiologyNeuralnetworksJava {

    public static void main(String[] args) {
        Linfocito linfocitoT = new Linfocito("T", 2, 3); // Crear un linfocito T con una red neuronal de 2 entradas y 3 neuronas en la capa oculta
        Linfocito linfocitoB = new Linfocito("B", 2, 3); // Crear un linfocito B con una red neuronal de 2 entradas y 3 neuronas en la capa oculta

        double[] entrada1 = {1, 0}; // Entrada para el linfocito T
        double[] entrada2 = {0, 1}; // Entrada para el linfocito B

        linfocitoT.activar();
        linfocitoT.tomarDecision(entrada1);

        linfocitoB.activar();
        linfocitoB.tomarDecision(entrada2);

        linfocitoT.desactivar();
        linfocitoB.desactivar();
    }
}
