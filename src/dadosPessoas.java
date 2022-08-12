import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtHomens, qtMulheres;
        double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;

        System.out.print("Informe que quantida de pessoas: ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        qtHomens = 0;
        qtMulheres = 0;
        alturaFemTotal = 0;
        for (int i = 0; i < n; i++) {
            if (generos[i] == 'M') {
                qtHomens++;
            }
            else {
                qtMulheres++;
                alturaFemTotal = alturaFemTotal + alturas[i];
            }
        }

        alturaFemMedia = alturaFemTotal / qtMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
        System.out.printf("Numero de homens = %d\n", qtHomens);

        sc.close();
    }
}
