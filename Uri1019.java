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
public class Uri1019 {
    public static void main(String[] args) {
        int total;

        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();

        int h = total / 3600;
        total = total - (h * 3600);

        int m = total / 60;
        total = total - (m * 60);

        System.out.printf("%d:%d:%d\n", h, m, total);

    }
}
