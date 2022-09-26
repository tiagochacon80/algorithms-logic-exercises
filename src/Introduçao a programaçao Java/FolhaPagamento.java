import java.util.Locale;
import java.util.Scanner;

// Folha de Pagamento
/* Precisamos saber quanto uma determinada empresa deve pagar para seus
colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor
hora. Escreva um programa que leia o número de um colaborador, seu número de
horas trabalhadas, o valor que recebe por hora e calcula o salário desse
colaborador. Em seguida, apresente o número e o salário do colaborador, com
duas casas decimais.
- Entrada
Você receberá 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o
funcionário recebe por hora trabalhada.
- Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um
espaço em branco antes e depois da igualdade. No caso do salário, também deve
haver um espaço em branco após o $. */
public class FolhaPagamento {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu ID do empregado: ");
        int id = sc.nextInt();
        System.out.print("Informe a quantidade de horas trabalhada: ");
        int horas = sc.nextInt();
        System.out.print("Informe o valor (R$) por hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;
        System.out.print("Numero: " + id + "\n");
        System.out.printf("Salario: R$ %.2f", salario);

        sc.close();
    }
}
