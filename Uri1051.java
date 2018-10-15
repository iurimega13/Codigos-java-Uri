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
public class Uri1051 {
    public static void main(String[] args) {
        float num, total ,t1, t2, t3;
        Scanner sc = new Scanner(System.in);
        num = sc.nextFloat();
  
        if(num <= 2000){
            System.out.print("Isento\n");
        }else{
            if(num > 2000 && num <= 3000){
                t1 = num - 2000;
                t1 = ((t1 * 8) / 100);
                total = t1;
            }else if(num > 3000 && num <= 4500){
                t1 = num - 2000;
                t2 = t1 - 1000;
                t1 -= t2;
                t1 = ((t1 * 8) / 100);
                t2 = ((t2 * 18) / 100);
                total = t2 + t1;
            }else{
                t1 = num - 2000;
                t2 = t1 - 1000;
                t3 = t2 - 1500;
                t1 -= t2;
                t2 -= t3;
                t1 = ((t1 * 8) / 100);
                t2 = ((t2 * 18) / 100);
                t3 = ((t3 * 28) / 100);
                total = t3 + t2 + t1;
            }
            System.out.printf("R$ %.2f\n",total);
        }
    }
}
