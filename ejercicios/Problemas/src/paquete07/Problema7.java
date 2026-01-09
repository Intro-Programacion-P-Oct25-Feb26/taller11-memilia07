/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] mensajeCiudadesEcuador = ciudades();
        
        System.out.println("Ciudades ingresadas:");
        for(int i = 0; i < mensajeCiudadesEcuador.length; i++) {
            System.out.println(mensajeCiudadesEcuador[i]);
        }
        System.out.println("Ciudades con 4 o 5 caracteres:");
        
        for(int i = 0; i < mensajeCiudadesEcuador.length; i++) {
            if (mensajeCiudadesEcuador[i].length() == 4 || mensajeCiudadesEcuador[i].length() == 5) 
            {
                System.out.println(mensajeCiudadesEcuador[i]);
            }
        }
    }
    
    public static String[] ciudades() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numeroCiudades;
        String nombreCiudades;
        
        System.out.println("Ingrese el número de ciudades:");
        numeroCiudades = entrada.nextInt();
        
        entrada.nextLine();
        
        String[] ciudadesEcuador = new String[numeroCiudades];
        for (int i = 0; i < numeroCiudades; i++) {
            System.out.printf("Ingrese el nombre de la ciudad número %d:"
                    + " ", i + 1);
            
            nombreCiudades = entrada.nextLine();
            
            ciudadesEcuador[i] = nombreCiudades;
        }
        return ciudadesEcuador;
    }
}

