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
public class Uri1018 {
    public static void main(String[] args) {
        int notas, tmp;

        Scanner sc = new Scanner(System.in);
        notas = sc.nextInt();

        System.out.printf("%d\n", notas);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas/100);
        tmp = (notas%100);


         System.out.printf("%d nota(s) de R$ 50,00\n", tmp/50);
        tmp = (tmp%50);

        System.out.printf("%d nota(s) de R$ 20,00\n", tmp/20);
        tmp = (tmp%20);

        System.out.printf("%d nota(s) de R$ 10,00\n", tmp/10);
        tmp = (tmp%10);

        System.out.printf("%d nota(s) de R$ 5,00\n", tmp/5);
        tmp = (tmp%5);

        System.out.printf("%d nota(s) de R$ 2,00\n", tmp/2);
        tmp = (tmp%2);

        System.out.printf("%d nota(s) de R$ 1,00\n", tmp/1);

    }
}
