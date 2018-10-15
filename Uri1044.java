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
public class Uri1044 {
    public static void main(String[] args) {
        int A, B;
        Scanner input =new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        if (B % A == 0 || A % B == 0) {
            System.out.print("Sao Multiplos\n");
        }else {
            System.out.print("Nao sao Multiplos\n");
        }
    }
}
