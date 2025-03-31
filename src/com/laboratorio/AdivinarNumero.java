package com.laboratorio;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; 
        int intentos = 0;
        int numeroUsuario = 0;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (numeroUsuario != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } 
            else  if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor.");
            }
        }

        System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en " + intentos + " intentos.");
        
        scanner.close();
    }
}


