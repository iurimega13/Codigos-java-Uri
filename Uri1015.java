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
public class Uri1015 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;

        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.printf("%.4f\n", distancia);
    }
}
