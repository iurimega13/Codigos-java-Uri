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
public class Uri1040 {
    public static void main(String[] args) {
        float N1, N2, N3, N4,media,N5,rmedia;

        Scanner input =new Scanner(System.in);

        N1 =input.nextFloat();

        N2 =input.nextFloat();

        N3 =input.nextFloat();

        N4 =input.nextFloat();

  

        media =((N1 * 2)+(N2 * 3)+( N3 * 4)+(N4 * 1))/10;

  

        if (media >= 7.0) {

   

        System.out.printf("Media: %.1f\n",media);

        System.out.print("Aluno aprovado.\n");

    

        }else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Media: %.1f\n",media);

            System.out.print("Aluno em exame.\n");

            N5 =input.nextFloat();

            System.out.printf("Nota do exame: %.1f\n",N5);

            rmedia =(media + N5) / 2;



            if (rmedia >= 5.0) {

                System.out.print("Aluno aprovado.\n");

            }else {

                System.out.print("Aluno reprovado.\n");

            }

            System.out.printf("Media final: %.1f\n",rmedia);

   

        }else if (media < 5.0) {
            System.out.printf("Media: %.1f\n",media);

            System.out.print("Aluno reprovado.\n");

        }
    }
}
