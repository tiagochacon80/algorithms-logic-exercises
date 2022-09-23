// Senha Fixa
/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha
Invalida". Quando a senha for informada corretamente deve ser impressa a
mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
correta é o valor 2002.
- Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.
- Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/

import java.util.Scanner;

public class SenhaFixa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            System.out.print("Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
