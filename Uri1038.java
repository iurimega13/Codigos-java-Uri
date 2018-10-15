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
public class Uri1038 {
    public static void main(String[] args) {
        int X, Y;
        float preco = 0;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();
        
        if (X == 1) {
            preco  = (float) (4.00 * Y);
        }else if (X == 2) {
            preco  = (float) (4.50 * Y);
        }else if (X == 3) {
            preco  = (float) (5.00 * Y);
        }else if (X == 4) {
            preco  = (float) (2.00 * Y);
        }else if (X == 5) {
            preco  = (float) (1.50 * Y);
        }   
        System.out.printf("Total: R$ %.2f\n",preco);

    }
}
