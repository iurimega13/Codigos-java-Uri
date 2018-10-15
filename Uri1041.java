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
public class Uri1041 {
    public static void main(String[] args) {
        float X, Y;
        Scanner input =new Scanner(System.in);
        X = input.nextFloat();
        Y = input.nextFloat();
        if (X == 0.0 && Y == 0.0) {
            System.out.print("Origem\n");
        }else if (X == 0.0 && Y != 0.0) {
            System.out.print("Eixo Y\n");
        }else if (Y == 0.0 && X != 0.0) {
            System.out.print("Eixo X\n");
        }else if (X > 0.0 && Y > 0.0) {
            System.out.print("Q1\n");
        }else if (X < 0.0 && Y < 0.0) {
            System.out.print("Q3\n");
        }else if (X < 0.0 && Y > 0.0) {
            System.out.print("Q2\n");
        }else  {
            System.out.print("Q4\n");
        }
    }
}
