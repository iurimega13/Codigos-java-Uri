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
public class Uri1006 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, med;
        Scanner sc =new Scanner(System.in);

        nota1 =sc.nextDouble();
        nota2 =sc.nextDouble();
        nota3 =sc.nextDouble();

        med = (nota1/10 * 2) + (nota2/10 * 3) + (nota3/10 * 5);
        String media = String.format("MEDIA = %,.1f", med);

        System.out.print(media +"\n");
    }
}
