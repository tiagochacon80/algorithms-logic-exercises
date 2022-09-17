// Quadrante

/*
Desenvolva um programa para ler as coordenadas (M,N) de uma quantidade
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma
de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
- Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores
inteiros.
- Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se
encontra a coordenada lida, conforme o exemplo.
*/

import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y !=0) {
            if(x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
