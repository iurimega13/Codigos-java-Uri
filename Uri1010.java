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
public class Uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linha1 = sc.nextLine();
	String linha2 = sc.nextLine();
		
	String[] v1 = linha1.split(" ");
	String[] v2 = linha2.split(" ");
		
	int codigo1 = Integer.parseInt(v1[0]);
	int quantidade1 = Integer.parseInt(v1[1]);
	double preco1 = Double.parseDouble(v1[2]);

	int codigo2 = Integer.parseInt(v2[0]);
	int quantidade2 = Integer.parseInt(v2[1]);
	double preco2 = Double.parseDouble(v2[2]);
		
	double total = 0.0;
		
	total = (quantidade1 * preco1	) + (quantidade2 * preco2);
	System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
    }
}
