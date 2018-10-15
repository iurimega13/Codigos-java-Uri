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
public class Uri1043 {
    public static void main(String[] args) {
        float A, B, C, areaTrapezio, perimetroTriangulo;
        Scanner input =new Scanner(System.in);
        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();

        if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
            perimetroTriangulo = A + B + C;
            System.out.printf("Perimetro = %.1f\n",perimetroTriangulo);
        }else {
            areaTrapezio = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n",areaTrapezio);
        }
    }
}
