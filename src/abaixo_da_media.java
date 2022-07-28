import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, media;

        System.out.print("Informe a quantidade de elementos do vetor: ");
        int N = sc.nextInt();

        double[] vetor = new double[N];

        for (int i=0; i<N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        soma = 0.0;
        for (int i=0; i<N; i++) {
            soma += vetor[i];
        }

        media = soma / N;

        System.out.printf("A média do vetor é: %.2f\n", media);
        System.out.println("Os elementos abaixo da média sao: ");

        for (int i=0; i<N; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        sc.close();
    }

}
