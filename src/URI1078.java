import java.util.Scanner;

public class URI1078 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int resultado = 0;

        for (int i = 1; i <= 10 ; i++) {
            resultado = i * n;
            System.out.println(i + " x " + n + " = " + resultado);
        }

        sc.close();
    }
}
