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
public class Uri1046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio = in.nextInt();
        int fim = in.nextInt();
        in.close();
        if (fim <= inicio) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (inicio - fim));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", fim - inicio);
        }
    }
}
