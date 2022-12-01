import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
