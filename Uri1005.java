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
public class Uri1005 {
    public static void main(String[] args) {
        float num1, num2, med;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        med = (float) (((num1 * 3.5) + (num2 * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", med);
        System.out.print(media +"\n");
 
    }
}
