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
            pcompra[i] = sc.nextDouble();
            System.out.print("Preço de venda: ");
            pvenda[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++) {
            porcentagemLucros[i] = (pvenda[i] - pcompra[i]) / pcompra[i] * 100.00;
        }

        abaixo = 0;
        entre = 0;
        acima = 0;

        for (int i=0; i<n; i++) {
            if (porcentagemLucros[i] < 10.0) {
                abaixo++;
            }
            else if (porcentagemLucros[i] < 20.0) {
                entre++;
            }
            else {
                acima++;
            }
        }

        vTotalCompra = 0;
        vTotalVenda = 0;

        for (int i=0; i<n; i++) {
            vTotalCompra = vTotalCompra + pcompra[i];
            vTotalVenda = vTotalVenda + pvenda[i];
        }

        lucroTotal = vTotalVenda - vTotalCompra;

        System.out.println("\nRELATORIO:");
        System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
        System.out.printf("Lucro acima de 20%%: %d\n", acima);
        System.out.printf("Valor total da compra: %.2f\n", vTotalCompra);
        System.out.printf("Valor total da venda: %.2f\n", vTotalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

        sc.close();
    }
}
