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
public class Uri1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double n = sc.nextDouble();
		
	if (n >= 0 && n <= 25) {
            System.out.println("Intervalo [0,25]");
        }else if (n > 25 && n <= 50) {
            System.out.println("Intervalo (25,50]");
	}else if(n > 50 && n <= 75){
            System.out.println("Intervalo (50,75]");
	}else if(n > 75 && n <= 100){
            System.out.println("Intervalo (75,100]");
	}else {
            System.out.println("Fora de intervalo");
        }
    }
}
