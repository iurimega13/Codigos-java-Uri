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
public class Uri1049 {
    public static void main(String[] args) {
        String A, B, C;
        Scanner input =new Scanner(System.in);
        A = input.next();
        B = input.next();
        C = input.next();

        if (A.equals("vertebrado")  && B.equals("ave") && C.equals("carnivoro")) {
            System.out.print("aguia\n");
        }
        if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
            System.out.print("pomba\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
            System.out.print("homem\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
            System.out.print("vaca\n");
        }
  //-----------------------------------------------------------------
  
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
            System.out.print("pulga\n");
        }
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
            System.out.print("lagarta\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
            System.out.print("sanguessuga\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
            System.out.print("minhoca\n");
        }
    }
}
