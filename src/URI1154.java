/* Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
Saída
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal. */
import java.util.Scanner;

public class URI1154 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;
        while (idade > 0.0) {
            soma += idade;
            cont++;
            idade = sc.nextInt();
        }
        double media = (double) soma / cont;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
