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

        double[] alturas = new double[];
        char[] generos = new char[];

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
        for (int i = 0; i < n; i++) {
            
        }

    }
}
