/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaRepeticao;

import java.util.Scanner;

/**
 *
 * @author iurimega13
 */
public class Uri1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPositivos = 0;
        for (int i = 0; i <= 6; i++) {
            double x = sc.nextDouble();
//            if (x == 0) {
//                --i;
//            }
            if (x % 2 == 0) {
                totalPositivos += 1;
            }
        }
        System.out.println(totalPositivos);
    }
}
