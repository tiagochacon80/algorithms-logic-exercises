/*Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
 de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
 Se for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular". */

import java.util.Scanner;

public class CalculandoIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;
        int soma = 0;

        while (x > 0) {
            soma += x; 
            cont++;
            x = sc.nextInt();
        }
        if (cont > 0) {
            double media = (double)soma / cont;
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("Impossivel calcular");
        }


        sc.close();
    }
}
