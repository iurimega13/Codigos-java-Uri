/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSelecao;

import java.util.Scanner;

/**
 *
 * @author iurimega13
 */
public class Uri1042 {
    public static void main(String[] args) {
        int X, Y, Z, minimo1, minimo2 = 0, minimo3 = 0;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();
        Z = input.nextInt();
        minimo1 = Math.min(X, Math.min(Y, Z));
        if (minimo1 == X) {
            minimo2 =Math.min(Y, Z);
            minimo3 =Math.max(Y, Z);
        }
        if (minimo1 == Y) {
            minimo2 =Math.min(X, Z);
            minimo3 =Math.max(X, Z);
        }
        if (minimo1 == Z) {
            minimo2 = Math.min(X, Y);
            minimo3 = Math.max(X, Y);
        }
        System.out.print(minimo1+"\n"+minimo2+"\n"+minimo3+"\n\n");
        System.out.print(X+"\n"+Y+"\n"+Z+"\n");
    }
}
