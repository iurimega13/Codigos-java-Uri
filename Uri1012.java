/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSequencial;

import java.util.Scanner;

/**
 *
 * @author iurimega13
 */
public class Uri1012 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;

        Scanner sc = new Scanner(System.in);
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        valor3 = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (valor1 * valor3) / 2);
        System.out.printf("CIRCULO: %.3f\n", valor3 * valor3 * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((valor1 + valor2) / 2) * valor3);
        System.out.printf("QUADRADO: %.3f\n", valor2 * valor2);
        System.out.printf("RETANGULO: %.3f\n", valor1 * valor2);
    }
}
