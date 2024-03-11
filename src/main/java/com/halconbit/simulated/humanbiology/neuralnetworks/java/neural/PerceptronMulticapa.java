
package com.halconbit.simulated.humanbiology.neuralnetworks.java.neural;

public class PerceptronMulticapa {

    private double[][] pesosCapaOculta; // Pesos entre la capa de entrada y la capa oculta
    private double[] pesosCapaSalida; // Pesos entre la capa oculta y la capa de salida
    private double[] entradas;
    private double[] salidaCapaOculta;
    private double salidaRed;

    public PerceptronMulticapa(int numEntradas, int numNeuronasCapaOculta) {
        pesosCapaOculta = new double[numEntradas][numNeuronasCapaOculta];
        pesosCapaSalida = new double[numNeuronasCapaOculta];
        salidaCapaOculta = new double[numNeuronasCapaOculta]; // Inicializar el array salidaCapaOculta
        
        // Inicializar los pesos de forma aleatoria
        for (int i = 0; i < numEntradas; i++) {
            for (int j = 0; j < numNeuronasCapaOculta; j++) {
                pesosCapaOculta[i][j] = Math.random();
            }
        }
        
        for (int i = 0; i < numNeuronasCapaOculta; i++) {
            pesosCapaSalida[i] = Math.random();
        }
    }

    public double activacion(double x) {
        // Función de activación (puedes usar diferentes funciones según tu necesidad)
        return 1 / (1 + Math.exp(-x));
    }

    public void feedForward(double[] entradas) {
        this.entradas = entradas;
        
        // Calcular la salida de la capa oculta
        for (int i = 0; i < salidaCapaOculta.length; i++) {
            double suma = 0;
            for (int j = 0; j < entradas.length; j++) {
                suma += entradas[j] * pesosCapaOculta[j][i];
            }
            salidaCapaOculta[i] = activacion(suma);
        }

        // Calcular la salida de la red
        double sumaRed = 0;
        
        for (int i = 0; i < salidaCapaOculta.length; i++) {
            sumaRed += salidaCapaOculta[i] * pesosCapaSalida[i];
        }
        
        salidaRed = activacion(sumaRed);
    }

    public double getSalidaRed() {
       return salidaRed;
   }
}