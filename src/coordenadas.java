import java.util.Locale;
import java.util.Scanner;

public class coordenadas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de x: ");
        x = sc.nextDouble();

        System.out.print("Valor de y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }

        sc.close();
    }
}
