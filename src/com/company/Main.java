package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static double TRMAprox = 3579.93;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double cantUSD = pedirCantUSD();
        double cantCOP = convert_USD_A_COP(cantUSD);
        mostrarResult(cantUSD, cantCOP);
    }

    private static double pedirCantUSD(){
        System.out.println("Ingrese la cantidad en dólares (USD) que quiere convertir a pesos colombianos (COP)");
        return scanner.nextDouble();
    }

    private static double convert_USD_A_COP(double cantUSD) {
        return cantUSD * TRMAprox;
    }

    private static void mostrarResult(double cantUSD, double cantCOP) {
        DecimalFormat formatoDecimal = new DecimalFormat("###.##");
        System.out.println(formatoDecimal.format(cantUSD) + " dólares (USD) son " + formatoDecimal.format(cantCOP) + " pesos (COP).");
    }
}
