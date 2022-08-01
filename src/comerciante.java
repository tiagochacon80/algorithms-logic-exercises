import java.util.Locale;
import java.util.Scanner;

public class comerciante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, abaixo, entre, acima;
        double vTotalCompra, vTotalVenda, lucroTotal;

        System.out.print("Quantidade de produtos a serem digitados: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] pcompra = new double[n];
        double[] pvenda = new double[n];
        double[] porcentagemLucros = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Produto %d:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Preço de compra: ");
            
        }

        sc.close();
    }
}
