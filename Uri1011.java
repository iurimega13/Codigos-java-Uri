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
public class Uri1011 {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble();
  
        System.out.printf("VOLUME = %.3f\n", (4 * 3.14159 * Math.pow(valor, 3.0)) / 3);
    }
}
