import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
decimais, conforme exemplo.
 */
public class AreaPerimetroDiagonal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura = sc.nextDouble();
        double base = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();
    }
}
