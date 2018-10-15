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
public class Uri1013 {
    public static void main(String[] args) {
        int num1, num2, num3, tmp;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        tmp = num1;
        if(num1 < num2 || num1 < num3){
            if(num2 < num3){
            tmp = num3;
            }else{
            tmp = num2;
            }
        }

        System.out.printf("%d eh o maior\n", tmp);

    }
}
