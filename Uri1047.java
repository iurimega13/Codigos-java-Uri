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
public class Uri1047 {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        int inicio_h = sc.nextInt();
        int inicio_m = sc.nextInt();
        int fim_h = sc.nextInt();
        int fim_m = sc.nextInt();
     
        int duracao_h = fim_h - inicio_h;

        if (duracao_h < 0){
            duracao_h = 24 + (fim_h - inicio_h);
        }

        int duracao_m = fim_m - inicio_m;
        if (duracao_m < 0){
            duracao_m = 60 + (fim_m - inicio_m);
            duracao_h--;
        }

        if (inicio_h == fim_h && inicio_m == fim_m){  
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }else{ 
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracao_h, duracao_m);
        }

    }
}
