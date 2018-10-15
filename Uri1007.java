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
public class Uri1007 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int num1, num2, num3, num4, diferenca;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        diferenca = num1 * num2 - num3 * num4;

        System.out.print("DIFERENCA = "+ diferenca +"\n");

    }
}
