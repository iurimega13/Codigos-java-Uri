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
public class Uri1048 {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();
        if (n <= 400.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", n * 1.15, n * 0.15);
        }else if (n <= 800.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", n * 1.12, n * 0.12);
        }else if (n <= 1200.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", n * 1.10, n * 0.10);
        }else if (n <= 2000.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", n * 1.07, n * 0.07);
        }else{
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", n * 1.04, n * 0.04);
        }
    }
}
