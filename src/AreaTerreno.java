import java.util.Locale;
import java.util.Scanner;

public class AreaTerreno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double lagura = sc.nextDouble();
        Double comprimento = sc.nextDouble();
        Double MetroQuadrado = sc.nextDouble();

        Double area = lagura * comprimento;
        Double precoFinal = area * MetroQuadrado;

        System.out.printf("AERA = %.2f%n", area);
        System.out.printf("PREÇO FINAL = %.2f%n", precoFinal);

        sc.close();
    }
}
