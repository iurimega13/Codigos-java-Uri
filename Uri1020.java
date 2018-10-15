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
public class Uri1020 {
    public static void main(String[] args) {
        int idade;

        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        int anos = idade / 365;
        int restoAnos = idade % 365;
        int restomes = restoAnos % 30;
        int mes = restoAnos / 30;
        int dias = restomes % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, mes, dias);

    }
}
