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
public class Uri1050 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num == 61){
            System.out.printf("Brasilia\n");
        }else if(num == 71){
            System.out.printf("Salvador\n");
        }else if(num == 11){
            System.out.printf("Sao Paulo\n");
        }else if(num == 21){
            System.out.printf("Rio de Janeiro\n");
        }else if(num == 32){
            System.out.printf("Juiz de Fora\n");
        }else if(num == 19){
            System.out.printf("Campinas\n");
        }else if(num == 27){
            System.out.printf("Vitoria\n");
        }else if(num == 31){
            System.out.printf("Belo Horizonte\n");
        }else{
            System.out.printf("DDD nao cadastrado\n");
        }
    }
}
