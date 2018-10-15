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
public class Uri1016 {
    public static void main(String[] args) {
        int distancia;

        Scanner sc = new Scanner(System.in);
        distancia = sc.nextInt();

        int tempo = (int) (distancia / ((90 / 60.0) - (60 / 60.0)));

        System.out.printf("%d minutos\n", tempo);
    }
}
