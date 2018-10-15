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
public class Uri1036 {
    public static void main(String[] args) {
        double num1, num2, num3, R1, R2;
        Scanner input =new Scanner(System.in);
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
  
        if ((num1 == 0) || (((num2*num2) -(4*num1*num3)) < 0)) {
            System.out.print("Impossivel calcular\n");
        }else {
            R1 = ((-num2 + Math.sqrt(((num2*num2) -(4*num1*num3)))) / (2*num1));
            R2 = ((-num2 - Math.sqrt(((num2*num2) -(4*num1*num3)))) / (2*num1));
   
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
