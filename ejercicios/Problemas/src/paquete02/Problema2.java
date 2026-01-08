/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String viviendas[] = nombres();
        double gastoMensual[][] = gasto(viviendas);
        double gastoAnual[] = anual(gastoMensual);
        reporte(viviendas, gastoAnual);

    }

    public static String[] nombres() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String z[] = new String[10];
        for (int i = 0; i < z.length; i++) {
            System.out.println("Ingrese el nombre de su vivienda");
            z[i] = entrada.nextLine();

        }
        return z;
    }

    public static double[][] gasto(String[] a) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double gastoMensual;
        double e[][] = new double[10][12];
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Ingrese los gastos de la vivienda %s:\n",
                    a[i]);
            for (int j = 0; j < e[i].length; j++) {
                System.out.printf("mes %s\n", j + 1);
                gastoMensual = entrada.nextDouble();
                e[i][j] = gastoMensual;
            }
        }
        return e;
    }

    public static double[] anual(double[][] anual) {
        double a[] = new double[10];
        for (int i = 0; i < anual.length; i++) {
            double suma = 0;
            for (int j = 0; j < anual[i].length; j++) {
                suma = suma + anual[i][j];
            }
            a[i] = suma;
        }
        return a;
    }

    public static void reporte(String[] casa, double[] anual) {
        String cadena = "";
        for (int i = 0; i < casa.length; i++) {
            cadena = String.format("%sVivienda %s\nGasto anual: %.2f\n", cadena,
                    casa[i], anual[i]);

        }
        System.out.printf(cadena);

    }

}
