/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido.
 */
import java.util.Scanner;

public class URI1020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano, mes, dia, resto;
        int idade = sc.nextInt();

        ano = idade / 365;
        resto = idade % 365;

        mes = resto / 30;
        dia = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
