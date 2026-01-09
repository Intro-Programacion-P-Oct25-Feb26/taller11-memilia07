/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String cedula;
        int tipo;
        System.out.println("Ingrese 1: Para calcular la planilla de luz y 2: Para "
                + "el predio urbano.");
        tipo = entrada.nextInt();
        entrada.nextLine();

        if (tipo == 1 || tipo == 2) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su Cédula");
            cedula = entrada.nextLine();
            switch (tipo) {
                case 1:
                    planillaLuz(nombre, cedula);
                    break;
                case 2:
                    predio(nombre, cedula);
                    break;
            }
        } else {
            System.out.println("Opción inválida");

        }

    }

    public static void planillaLuz(String a, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double kilovatio;
        double valorKilovatio;
        double valor;
        System.out.println("Ingrese cuántos kilovatios ha consumido");
        kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el valor por kilovatio");
        valorKilovatio = entrada.nextDouble();

        valor = kilovatio * valorKilovatio;

        System.out.printf("Cliente %s con cédula %s debe cancelar $%.2f\n", a,
                c,
                valor);

    }

    public static void predio(String a, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double inmueble;
        double porcentaje;
        System.out.println("Ingrese el valor de su inmueble");
        inmueble = entrada.nextDouble();

        porcentaje = inmueble * 0.02;

        System.out.printf("Cliente %s con cédula %s tiene un inmueble valorado "
                + "en $%.2f y tiene que pagar de predio: $%.2f\n", a,
                c, inmueble, porcentaje);

    }

}
