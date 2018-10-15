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
public class Uri1009 {
    public static void main(String[] args) {
        double salario = 0,valor, TOTAL;
        String nome;
        Scanner sc = new Scanner(System.in);
        nome = sc.next();
        salario = sc.nextDouble();
        valor = sc.nextDouble();
   

        TOTAL = salario + valor * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
    }
}
