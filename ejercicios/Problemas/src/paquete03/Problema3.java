/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        double respuesta = 0;

        System.out.println("Ingrese el area a calcular: 1: Cuadrado, 2: Triangulo, 3:Rectangulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Opcion Invalida");
                }            
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double lado;
        double area;

        System.out.println("Ingrese la longitud del lado del cuadrado");
        lado = entrada.nextDouble();

        area = lado * lado;

        System.out.printf("El area del cuadrado es%s\n:", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();

        area = (base * altura / 2);

        System.out.printf("El area del  triangulo es %s\n:", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.printf("El area del rectangulo es %s\n:", area);
    }
}
