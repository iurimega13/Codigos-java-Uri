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
public class Uri1008 {
    public static void main(String[] args) {
        int num1,num2;

       float num3;

       Scanner sc =new Scanner(System.in);

       num1 = sc.nextInt();

       num2 = sc.nextInt();

       num3 = sc.nextFloat();

       System.out.printf("NUMBER = %d\n", num1);

       System.out.printf("SALARY = U$ %.2f\n", num2 * num3);

    }
}
