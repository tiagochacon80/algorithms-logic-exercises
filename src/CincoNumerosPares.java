// Cinco Números Pares
/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos
a partir de X, um valor por linha, inclusive o X se for o caso.
- Entrada
A entrada será um valor inteiro positivo.
- Saída
A saída será uma sequência de seis números ímpares.
*/
import java.util.Scanner;

public class CincoNumerosPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int y = sc.nextInt();

        int cont = 0;
        while (cont < 5) {
            if (y % 2 == 0) {
                System.out.println(y);
                cont++;
            }
            y++;
        }



    }
}
