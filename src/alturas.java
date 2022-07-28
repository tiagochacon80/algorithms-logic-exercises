import java.util.Locale;
import java.util.Scanner;

public class alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nmenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.print("Informe a quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        String[] nomes = new String[quantidadePessoas];
        int[] idades = new int[quantidadePessoas];
        double[] altura = new double[quantidadePessoas];

        for (int i=0; i<quantidadePessoas; i++) {
            System.out.printf("Dados da %da pessoa\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        nmenores = 0;
        alturaTotal = 0;
        for (int i = 0; i<quantidadePessoas; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            alturaTotal += altura[i];
        }

        alturaMedia = alturaTotal / quantidadePessoas;
        percentualMenores = ((double) nmenores / quantidadePessoas) * 100.00;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i=0; i<quantidadePessoas; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
