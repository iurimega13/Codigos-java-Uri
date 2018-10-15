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
public class Uri1014 {
    public static void main(String[] args) {
        double distancia, combustivel;

        Scanner sc = new Scanner(System.in);
        distancia = sc.nextDouble();
        combustivel = sc.nextDouble();

        System.out.printf("%.3f km/l\n", distancia / combustivel);
    }
}
